package ar.edu.utn.frba.dds.domain.prenda;

public class Prenda {
  private Material material;
  private TipoPrenda tipo;
  private Color colorPrimario;
  private Color colorSecundario;

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
}

