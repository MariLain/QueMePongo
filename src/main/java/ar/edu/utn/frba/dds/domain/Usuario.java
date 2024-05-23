package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.domain.motores.ProveedorMotor;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Usuario {
  private final List<Prenda> prendas;

  private List<Guardaropa> guardaropas = new ArrayList<>();
  private Integer edad;
  private ProveedorMotor proveedorMotor;
  private String cuidad;
  private List<Sugerencia> sugerencias = new ArrayList<>();
  private List<Sugerencia> sugerenciasAceptadas = new ArrayList<>();

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

  public void compartirGuardarropa(Usuario usuario, Guardaropa guardaropa) {
    usuario.recibirGuardarropa(guardaropa);
  }

  public void recibirGuardarropa(Guardaropa guardaropa) {
    guardaropas.add(guardaropa);
  }

  public void sugerirPrenda(Usuario usuario, Sugerencia sugerencia) {
    usuario.recibirSugerencia(sugerencia);
  }

  public void recibirSugerencia(Sugerencia sugerencia) {
    if (guardaropas.contains(sugerencia.getGuardaropa())) {
      sugerencias.add(sugerencia);
    }
  }

  public void aceptar(Sugerencia sugerencia) {
    if (sugerencias.contains(sugerencia)) {
      sugerencia.aceptar();
    }
  }

  public void deshacer(Sugerencia sugerencia) {
    if (sugerenciasAceptadas.contains(sugerencia)) {
      sugerencia.revertir();
    }
  }
}
