package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.domain.prenda.Prenda;

public class Atuendo {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;

  public Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    this.prendaSuperior = new Prenda(prendaSuperior);
    this.prendaInferior = new Prenda(prendaInferior);
    this.calzado = new Prenda(calzado);
  }

  public Prenda getPrendaSuperior() {
    return new Prenda(prendaSuperior);
  }

  public Prenda getPrendaInferior() {
    return new Prenda(prendaInferior);
  }

  public Prenda getCalzado() {
    return new Prenda(calzado);
  }
}
