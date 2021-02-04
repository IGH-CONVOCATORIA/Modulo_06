package com.capacitacion.mod06.dto;

public class TrabajadorDto {

  private double horasTrabajadas;
  private double pagoXHora;
  private int cantidadHijos;

  private double salario;
  private double asignacion;
  private double bono;
  private double ingresos;
  private double impuestoRenta;
  private double salarioNeto;

  public TrabajadorDto() {}

  public TrabajadorDto(
    double horasTrabajadas,
    double pagoXHora,
    int cantidadHijos
  ) {
    this.horasTrabajadas = horasTrabajadas;
    this.pagoXHora = pagoXHora;
    this.cantidadHijos = cantidadHijos;
  }

  public double getHorasTrabajadas() {
    return horasTrabajadas;
  }

  public void setHorasTrabajadas(double horasTrabajadas) {
    this.horasTrabajadas = horasTrabajadas;
  }

  public double getPagoXHora() {
    return pagoXHora;
  }

  public void setPagoXHora(double pagoXHora) {
    this.pagoXHora = pagoXHora;
  }

  public int getCantidadHijos() {
    return cantidadHijos;
  }

  public void setCantidadHijos(int cantidadHijos) {
    this.cantidadHijos = cantidadHijos;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getAsignacion() {
    return asignacion;
  }

  public void setAsignacion(double asignacion) {
    this.asignacion = asignacion;
  }

  public double getBono() {
    return bono;
  }

  public void setBono(double bono) {
    this.bono = bono;
  }

  public double getIngresos() {
    return ingresos;
  }

  public void setIngresos(double ingresos) {
    this.ingresos = ingresos;
  }

  public double getImpuestoRenta() {
    return impuestoRenta;
  }

  public void setImpuestoRenta(double impuestoRenta) {
    this.impuestoRenta = impuestoRenta;
  }

  public double getSalarioNeto() {
    return salarioNeto;
  }

  public void setSalarioNeto(double salarioNeto) {
    this.salarioNeto = salarioNeto;
  }
}
