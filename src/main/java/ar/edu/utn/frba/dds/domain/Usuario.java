package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.clima.ClimaApi;
import ar.edu.utn.frba.dds.domain.motores.MotorSugerencias;
import ar.edu.utn.frba.dds.domain.motores.ProveedorMotor;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Usuario {
  private final List<Prenda> prendas;
  private Integer edad;
  private ProveedorMotor proveedorMotor;
  private String cuidad;

  public Usuario(List<Prenda> prendas, Integer edad, ProveedorMotor proveedorMotor, String cuidad) {
    this.prendas = new ArrayList<>(prendas);
    this.edad = edad;
    this.proveedorMotor = new ProveedorMotor();
    this.cuidad = cuidad;
  }

  public List<Atuendo> generarSugerencias() {
    return proveedorMotor.getMotorSugerencias().generarSugerencias(this);
  }

  public List<Prenda> getPrendas() {
    return Collections.unmodifiableList(prendas);
  }

  public Integer getEdad() {
    return edad;
  }

  public String getCuidad() {
    return cuidad;
  }
}
