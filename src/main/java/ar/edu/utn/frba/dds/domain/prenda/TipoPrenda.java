package ar.edu.utn.frba.dds.domain.prenda;

public enum TipoPrenda {
  ZAPATO(Categoria.CALZADO),
  CAMISA(Categoria.PARTE_SUPERIOR),
  PANTALON(Categoria.PARTE_INFERIOR),
  CHOMBA(Categoria.PARTE_SUPERIOR),
  ZAPATILLA(Categoria.CALZADO);

  private Categoria categoria;

  TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }

}
