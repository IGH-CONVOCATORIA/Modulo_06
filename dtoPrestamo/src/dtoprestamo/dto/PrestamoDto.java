/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtoprestamo.dto;

/**
 *
 * @author dondo
 */
public class PrestamoDto {
    // Datos entrada
	private double capital;
	private double riesgo;
        private int tiempoMes;
	// Datos salida
	private double interes;
	private double amortizacion;
	private double cuota;
    
public PrestamoDto(){

}
public PrestamoDto(double capital,double riesgo,int tiempoMes){
     this.capital=capital;
     this.riesgo=riesgo;
this.tiempoMes=tiempoMes;
}
public double getCapital(){
return capital;
}
public void setCapital(double capital ){
this.capital=capital;
}

    public double getRiesgo() {
        return riesgo;
    }
public void setRiesgo(int riesgo ){
this.riesgo=riesgo;
}
    
    

    public int getTiempoMes() {
        return tiempoMes;
    }
public void setTiempoMes(int tiempoMes ){
this.tiempoMes=tiempoMes;
}
    public double getInteres() {
        return interes;
    }
    public void setInteres(double interes ){
this.interes=interes;
}

    public double getAmortizacion() {
        return amortizacion;
    }
    public void setAmortizacion(double amortizacion ){
this.amortizacion=amortizacion;
}

   

    public double getCuota() {
        return cuota;
    }
    public void setCuota(double couta ){
this.cuota=couta;
}

 
 

}



