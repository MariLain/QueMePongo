package ar.edu.utn.frba.dds;

public class Prenda {
  private String material;
  private TipoPrenda tipo;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(String material, TipoPrenda tipo, Color colorPrimario) {
    this.material = material;
    this.tipo = tipo;
    this.colorPrimario = colorPrimario;
  }

  public Prenda(String material, TipoPrenda tipo, Color colorPrimario, Color colorSecundario) {
    this.material = material;
    this.tipo = tipo;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

}

