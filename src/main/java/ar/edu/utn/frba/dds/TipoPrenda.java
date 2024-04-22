package ar.edu.utn.frba.dds;

public enum TipoPrenda {
  ZAPATO(Categoria.CALZADO),
  CAMISA(Categoria.PARTE_SUPERIOR),
  PANTALON(Categoria.PARTE_INFERIOR);

  private Categoria categoria;

  TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }

}
