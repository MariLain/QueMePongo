package ar.edu.utn.frba.dds.domain.uniforme;

import static ar.edu.utn.frba.dds.domain.prenda.Categoria.CALZADO;
import static ar.edu.utn.frba.dds.domain.prenda.Categoria.PARTE_INFERIOR;
import static ar.edu.utn.frba.dds.domain.prenda.Categoria.PARTE_SUPERIOR;

import ar.edu.utn.frba.dds.domain.prenda.Categoria;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Uniforme {
  private List<Prenda> prendas;

  public Uniforme(List<Prenda> prendas) {
    if (prendas.isEmpty() || !esUniforme(prendas)) {
      throw new RuntimeException();
    }
    this.prendas = Collections.unmodifiableList(prendas);
  }

  public Uniforme(Prenda sup, Prenda inf, Prenda calzado) {
    validar(PARTE_SUPERIOR, sup);
    validar(PARTE_SUPERIOR, inf);
    validar(PARTE_SUPERIOR, calzado);
    prendas.add(sup);
    prendas.add(inf);
    prendas.add(calzado);
  }

  public List<Prenda> getPrendas() {
    return Collections.unmodifiableList(prendas);
  }

  public void agregarParteSuperior(Prenda prenda) {
    validar(PARTE_SUPERIOR, prenda);
    prendas.add(prenda);
  }

  public void agregarParteInferior(Prenda prenda) {
    validar(PARTE_INFERIOR, prenda);
    prendas.add(prenda);
  }

  public void agregarCalzado(Prenda prenda) {
    validar(CALZADO, prenda);
    prendas.add(prenda);
  }

  private void validar(Categoria categoria, Prenda prenda) {
    if (prenda == null || prenda.getTipo().getCategoria().equals(categoria)) {
      throw new RuntimeException();
    }
  }

  private boolean esUniforme(List<Prenda> prendas) {
    return prendas.size() == 3 && ((prendas.stream().map(p -> p.getTipo().getCategoria())
        .filter(c -> Set.of(PARTE_SUPERIOR, PARTE_INFERIOR, CALZADO).contains(c))
        .count() == 3));
  }
}
