package ar.edu.utn.frba.dds.domain.prenda;

public class Prenda {
  private Material material;
  private TipoPrenda tipo;
  private Color colorPrimario;
  private Color colorSecundario;
  private Formalidad formalidad;

  public Prenda(Material material, TipoPrenda tipo, Color colorPrimario, Color colorSecundario) {
    this.material = material;
    this.tipo = tipo;
    this.colorPrimario = colorPrimario;
    this.colorSecundario= colorSecundario;
  }
  public Prenda(Material material, TipoPrenda tipo, Color colorPrimario) {
    this.material = material;
    this.tipo = tipo;
    this.colorPrimario = colorPrimario;
  }

  public Material getMaterial() {
    return material;
  }

  public TipoPrenda getTipo() {
    return tipo;
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }
  public boolean esSuperior(){
    return tipo.getCategoria() == Categoria.PARTE_SUPERIOR;
  }
  public boolean esInferior(){
    return tipo.getCategoria() == Categoria.PARTE_INFERIOR;
  }
  public boolean esCalzado(){
    return tipo.getCategoria() == Categoria.CALZADO;
  }

  public Formalidad getFormalidad() {
    return formalidad;
  }
}

