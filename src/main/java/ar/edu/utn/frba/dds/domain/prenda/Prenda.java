package ar.edu.utn.frba.dds.domain.prenda;

public class Prenda {
  private final Material material;
  private TipoPrenda tipo;
  private Color colorPrimario;
  private Color colorSecundario;
  private Formalidad formalidad;
  private double temperaturaMax;
  private Criterio criterio;

  public Prenda(Prenda prenda) {
    this.material = prenda.getMaterial();
  }

  public Prenda(Material material, TipoPrenda tipo, Color colorPrimario, Color colorSecundario) {
    this.material = new Material(material.getTela(), material.getTrama());
    this.tipo = tipo;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public Prenda(Material material, TipoPrenda tipo, Color colorPrimario) {
    this.material = new Material(material.getTela(), material.getTrama());
    this.tipo = tipo;
    this.colorPrimario = colorPrimario;
  }

  public Material getMaterial() {
    return new Material(material.getTela(), material.getTrama());
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

  public boolean esSuperior() {
    return tipo.getCategoria() == Categoria.PARTE_SUPERIOR;
  }

  public boolean esInferior() {
    return tipo.getCategoria() == Categoria.PARTE_INFERIOR;
  }

  public boolean esCalzado() {
    return tipo.getCategoria() == Categoria.CALZADO;
  }

  public Formalidad getFormalidad() {
    return formalidad;
  }

  public void setFormalidad(Formalidad formalidad) {
    this.formalidad = formalidad;
  }

  public double getTemperaturaMax() {
    return temperaturaMax;
  }

  public Criterio getCriterio() {
    return criterio;
  }

  public void setCriterio(Criterio criterio) {
    this.criterio = criterio;
  }
}

