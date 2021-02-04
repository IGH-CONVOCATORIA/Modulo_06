package com.capacitacion.mod06.service;

import com.capacitacion.mod06.dto.TrabajadorDto;

public class TrabajadorService {

  public TrabajadorDto procesar(TrabajadorDto dto) {
    double salario, asignacion, bono, ingresos, impuestoRenta, salarioNeto;

    salario = dto.getHorasTrabajadas() * dto.getPagoXHora();
    asignacion = 60.0 * dto.getCantidadHijos();
    bono = (dto.getHorasTrabajadas() - 160) * dto.getPagoXHora() * 2.0;
    ingresos = salario + asignacion + bono;
    impuestoRenta = 0;
    if (ingresos > 1500.00) {
      impuestoRenta = ingresos * 0.08;
    }
    salarioNeto = ingresos - impuestoRenta;

    dto.setSalario(salario);
    dto.setAsignacion(asignacion);
    dto.setBono(bono);
    dto.setIngresos(ingresos);
    dto.setImpuestoRenta(impuestoRenta);
    dto.setSalarioNeto(salarioNeto);

    return dto;
  }
}
