package ar.edu.utn.frba.dds;

public class Prenda {
  private Material material;
  private TipoPrenda tipo;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(Material material, TipoPrenda tipo, Color colorPrimario) {
    if(material == null || tipo == null || colorPrimario == null){
      throw new RuntimeException();
    }
    this.material = material;
    this.tipo = tipo;
    this.colorPrimario = colorPrimario;
  }
  
}

