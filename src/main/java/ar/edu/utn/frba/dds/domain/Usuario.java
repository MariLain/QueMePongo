package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.domain.motores.ProveedorMotor;
import com.google.common.collect.Lists;
import java.util.List;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;

public class Usuario {
  private List<Prenda> prendas;
  private Integer edad;
  private ProveedorMotor proveedorMotor;
  public List<Sugerencia> generarSugerencias(){
    return proveedorMotor.getMotorSugerencias().generarSugerencias(this);
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public Integer getEdad() {
    return edad;
  }
}
