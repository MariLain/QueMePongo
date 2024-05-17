package ar.edu.utn.frba.dds.domain.uniforme;

import ar.edu.utn.frba.dds.domain.prenda.Prenda;

public abstract class Sastre {
  public Uniforme crearUniforme() {
    return new Uniforme(fabricarParteSuperior(), fabricarParteInferior(), fabricarCalzado());
  }

  abstract Prenda fabricarParteSuperior();

  abstract Prenda fabricarParteInferior();

  abstract Prenda fabricarCalzado();
}
