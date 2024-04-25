package ar.edu.utn.frba.dds.domain.uniforme;

import ar.edu.utn.frba.dds.domain.prenda.Categoria;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;

import java.util.Collection;
import java.util.Set;

import static ar.edu.utn.frba.dds.domain.prenda.Categoria.CALZADO;
import static ar.edu.utn.frba.dds.domain.prenda.Categoria.PARTE_INFERIOR;
import static ar.edu.utn.frba.dds.domain.prenda.Categoria.PARTE_SUPERIOR;

public class Uniforme {
  private Collection<Prenda> prendas;

  public Uniforme(Collection<Prenda> prendas) {
    if (prendas.isEmpty() || !esUniforme(prendas)){
      throw new RuntimeException();
    }
    this.prendas = prendas;
  }
  public Uniforme(Prenda sup,Prenda inf, Prenda calzado){
    validar(PARTE_SUPERIOR,sup);
    validar(PARTE_SUPERIOR,inf);
    validar(PARTE_SUPERIOR,calzado);
    prendas.add(sup);
    prendas.add(inf);
    prendas.add(calzado);
  }
  public Collection<Prenda> getPrendas() {
    return prendas;
  }
  public void agregarParteSuperior(Prenda prenda){
    validar(PARTE_SUPERIOR,prenda);
    prendas.add(prenda);
  }
  public void agregarParteInferior(Prenda prenda){
    validar(PARTE_INFERIOR,prenda);
    prendas.add(prenda);
  }
  public void agregarCalzado(Prenda prenda){
    validar(CALZADO,prenda);
    prendas.add(prenda);
  }
  private void validar(Categoria categoria, Prenda prenda){
    if(prenda == null || prenda.getTipo().getCategoria().equals(categoria)){
      throw new RuntimeException();
    }
  }
  private boolean esUniforme(Collection<Prenda> prendas){
    return prendas.size() == 3 &&((prendas.stream().map(p->p.getTipo().getCategoria())
        .filter(c -> Set.of(PARTE_SUPERIOR, PARTE_INFERIOR, CALZADO).contains(c))
        .count() == 3));
  }
}
