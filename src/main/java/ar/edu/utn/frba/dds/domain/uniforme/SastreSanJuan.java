package ar.edu.utn.frba.dds.domain.uniforme;

import ar.edu.utn.frba.dds.domain.prenda.Material;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;
import ar.edu.utn.frba.dds.domain.prenda.Tela;
import ar.edu.utn.frba.dds.domain.prenda.TipoPrenda;

import static ar.edu.utn.frba.dds.domain.prenda.Color.BLANCO;
import static ar.edu.utn.frba.dds.domain.prenda.Color.GRIS;
import static ar.edu.utn.frba.dds.domain.prenda.Color.VERDE;
import static ar.edu.utn.frba.dds.domain.prenda.Tela.ACETATO;
import static ar.edu.utn.frba.dds.domain.prenda.Tela.PIQUE;
import static ar.edu.utn.frba.dds.domain.prenda.TipoPrenda.CHOMBA;
import static ar.edu.utn.frba.dds.domain.prenda.TipoPrenda.PANTALON;
import static ar.edu.utn.frba.dds.domain.prenda.TipoPrenda.ZAPATILLA;

public class SastreSanJuan extends Sastre{

  @Override
  Prenda fabricarParteSuperior() {
    return new Prenda(new Material(PIQUE), CHOMBA,VERDE);
  }

  @Override
  Prenda fabricarParteInferior() {
    return new Prenda(new Material(ACETATO),PANTALON,GRIS);
  }

  @Override
  Prenda fabricarCalzado() {
    return new Prenda(new Material(ACETATO),ZAPATILLA,BLANCO);
  }
}
