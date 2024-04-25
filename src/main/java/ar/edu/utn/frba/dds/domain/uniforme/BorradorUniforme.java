package ar.edu.utn.frba.dds.domain.uniforme;

import ar.edu.utn.frba.dds.domain.prenda.Categoria;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;

import java.util.Collection;

import static ar.edu.utn.frba.dds.domain.prenda.Categoria.CALZADO;
import static ar.edu.utn.frba.dds.domain.prenda.Categoria.PARTE_INFERIOR;
import static ar.edu.utn.frba.dds.domain.prenda.Categoria.PARTE_SUPERIOR;

public class BorradorUniforme {
  private Collection<Prenda> prendas;

  public BorradorUniforme(Uniforme sugerencia) {
    this.prendas = sugerencia.getPrendas();
  }
  public BorradorUniforme(){}
  public Uniforme guardarUniforme(){
    return new Uniforme(prendas);
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
}
