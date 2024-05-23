package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.domain.prenda.Criterio;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;
import java.util.ArrayList;
import java.util.List;

public class Guardaropa {

  private Criterio criterio;
  private List<Prenda> prendas = new ArrayList<>();

  public Guardaropa(Criterio criterio) {
    this.criterio = criterio;
  }

  public void agregarPrenda(Prenda prenda) {
    if (prenda.getCriterio().equals(criterio)) {
      prendas.add(prenda);
    }
  }

  public void quitarPrenda(Prenda prenda) {
    prendas.remove(prenda);
  }

}
