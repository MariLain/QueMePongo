package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.domain.prenda.Prenda;

public class Sugerencia {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda calzado;

  public Sugerencia(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado) {
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.calzado = calzado;
  }
}
