/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtoprestamo.service;
import dtoprestamo.dto.PrestamoDto;
/**
 *
 * @author dondo
 */
public class PrestamoService {
    public PrestamoDto procesar(PrestamoDto dto){
        //Variables
         double interes;
	 double amortizacion;
	 double cuota;
         
         
        // Proceso
		interes = dto.getRiesgo() * dto.getCapital();
		amortizacion = dto.getCapital()/dto.getTiempoMes();
		cuota =amortizacion+interes;
              
		// Retorno
		dto.setInteres(interes);
		dto.setAmortizacion(amortizacion);
		dto.setCuota(cuota);
		return dto;
        
        
    }
}
