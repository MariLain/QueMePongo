package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.domain.prenda.Prenda;

public class Sugerencia {
  private Guardaropa guardaropa;
  private Prenda prenda;
  private Accion accion;

  public Guardaropa getGuardaropa() {
    return guardaropa;
  }

  public Sugerencia(Guardaropa guardaropa, Prenda prenda, Accion accion) {
    this.guardaropa = guardaropa;
    this.prenda = new Prenda(prenda);
    this.accion = accion;
  }

  public void aceptar() {
    if (accion.equals(Accion.AGREGAR)) {
      guardaropa.agregarPrenda(prenda);
    } else {
      guardaropa.quitarPrenda(prenda);
    }
  }

  public void revertir() {
    if (accion.equals(Accion.AGREGAR)) {
      guardaropa.quitarPrenda(prenda);
    } else {
      guardaropa.agregarPrenda(prenda);
    }
  }
}
