package com.capacitacion.mod06.test;

import com.capacitacion.mod06.dto.TrabajadorDto;
import com.capacitacion.mod06.service.TrabajadorService;

public class TrabajadorTest {

  public static void main(String[] args) {
    TrabajadorDto dto = new TrabajadorDto(180, 60.0, 2);

    TrabajadorService service = new TrabajadorService();
    dto = service.procesar(dto);

    System.out.println("Salario: " + dto.getSalario());
    System.out.println("Asignacion: " + dto.getAsignacion());
    System.out.println("Bono: " + dto.getBono());
    System.out.println("Ingresos: " + dto.getIngresos());
    System.out.println("Impuesto a la renta: " + dto.getImpuestoRenta());
    System.out.println("Salario neto: " + dto.getSalarioNeto());
  }
}
