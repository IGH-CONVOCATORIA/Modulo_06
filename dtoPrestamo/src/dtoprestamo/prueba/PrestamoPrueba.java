/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtoprestamo.prueba;
import dtoprestamo.dto.PrestamoDto;
import dtoprestamo.service.PrestamoService;
/**
 *
 * @author dondo
 */
public class PrestamoPrueba {
    public static void main(String[] args) {
       
                int i,j,x,y,z,a,b;
                
                double intereses,cuotas,interese,capitales,amortizaciones;
                

		PrestamoDto dto = new PrestamoDto(1200,0.0425,6);
                PrestamoService service = new PrestamoService();
		dto = service.procesar(dto);
		double[] capitalm = new double[dto.getTiempoMes()];
                double[] amortizacionm = new double[dto.getTiempoMes()];
                double[] interesm = new double[dto.getTiempoMes()];
                double[] cuentam = new double[dto.getTiempoMes()];
                String[][] matriz = new String[dto.getTiempoMes()][4];
                // Proceso
                intereses=dto.getInteres();
                interese=dto.getInteres();
                capitales=dto.getCapital();
                amortizaciones=dto.getAmortizacion();
                cuotas=dto.getCuota();
		
               
                
                
                    for (j=0;j<capitalm.length;j++){
                        capitalm[j]=dto.getCapital();
                    }
                    for (i=0;i<amortizacionm.length;i++){
                        amortizacionm[i]=dto.getAmortizacion();
                    }
                     for (x=0;x<interesm.length;x++){
                        interesm[x]=intereses;
                        
                        
                        intereses=intereses/capitales*(capitales-amortizaciones);
                    }
                     for (y=0;y<cuentam.length;y++){
                        cuentam[y]=cuotas;
                        interese=interese/capitales*(capitales-amortizaciones);
                        cuotas=amortizaciones+interese;
                        
                    }
                    
                     for (a=0;a<cuentam.length;a++){
                         for (b=0;b<4;b++){
                             switch(b){
                                 case 0:matriz[a][b]=String.valueOf(capitalm[a]);
                           
                            break;
                                 case 1:matriz[a][b]=String.valueOf(amortizacionm[a]);
                            
                            break;
                                 case 2 : matriz[a][b]=String.valueOf(interesm[a]);
                           
                            break;
                                 case 3 :matriz[a][b]=String.valueOf(cuentam[a]);
                           
                            break;
                             }
                        
                     
                         }
                    }
                     
                  
               
		// Reporte
		 for (a=0;a<cuentam.length;a++){
                         for (b=0;b<4;b++){
                             switch(b){
                                 case 0:System.out.println("El capital es:"+capitalm[a]);
                           
                            break;
                                 case 1:System.out.println("La amortizacion es:"+amortizacionm[a]);
                            
                            break;
                                 case 2 : System.out.println("El interes es:"+interesm[a]);
                           
                            break;
                                 case 3 :System.out.println("La  cuota es:"+cuentam[a]);
                           
                            break;
                             }
                        
                     
                         }
                    }
                        
    }
}
