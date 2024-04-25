package ar.edu.utn.frba.dds.domain.prenda;

import ar.edu.utn.frba.dds.domain.prenda.Color;
import ar.edu.utn.frba.dds.domain.prenda.Material;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;
import ar.edu.utn.frba.dds.domain.prenda.TipoPrenda;

public class BorradorPrenda {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;

  public BorradorPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public void setColorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public Prenda guardarPrenda(){
    validarPrenda();
    return new Prenda(material,tipoPrenda,colorPrimario,colorSecundario);
  }

  private void validarPrenda(){
    if(material == null || tipoPrenda == null || colorPrimario == null){
      throw new RuntimeException();
    }
  }

}
