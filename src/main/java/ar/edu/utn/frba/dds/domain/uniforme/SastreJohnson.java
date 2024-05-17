package ar.edu.utn.frba.dds.domain.uniforme;

import static ar.edu.utn.frba.dds.domain.prenda.Color.BLANCO;
import static ar.edu.utn.frba.dds.domain.prenda.Color.NEGRO;
import static ar.edu.utn.frba.dds.domain.prenda.Tela.ALGODON;
import static ar.edu.utn.frba.dds.domain.prenda.Tela.CUERO;
import static ar.edu.utn.frba.dds.domain.prenda.TipoPrenda.CAMISA;
import static ar.edu.utn.frba.dds.domain.prenda.TipoPrenda.PANTALON;
import static ar.edu.utn.frba.dds.domain.prenda.TipoPrenda.ZAPATO;

import ar.edu.utn.frba.dds.domain.prenda.Material;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;

public class SastreJohnson extends Sastre {

  @Override
  Prenda fabricarParteSuperior() {
    return new Prenda(new Material(ALGODON), CAMISA, BLANCO);
  }

  @Override
  Prenda fabricarParteInferior() {
    return new Prenda(new Material(ALGODON), PANTALON, NEGRO);
  }

  @Override
  Prenda fabricarCalzado() {
    return new Prenda(new Material(CUERO), ZAPATO, NEGRO);
  }
}
