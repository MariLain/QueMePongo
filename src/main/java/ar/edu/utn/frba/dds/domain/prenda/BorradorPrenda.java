package ar.edu.utn.frba.dds.domain.prenda;

import ar.edu.utn.frba.dds.domain.prenda.Color;
import ar.edu.utn.frba.dds.domain.prenda.Material;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;
import ar.edu.utn.frba.dds.domain.prenda.TipoPrenda;

public class BorradorPrenda {
  private TipoPrenda tipoPrenda;
  private Tela tela;
  private Trama trama = Trama.LISA;
  private Color colorPrimario;
  private Color colorSecundario;

  public BorradorPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void setColorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void setTela(Tela tela) {
    this.tela = tela;
  }

  public void setTrama(Trama trama) {
    this.trama = trama;
  }

  public Prenda guardarPrenda() {
    validarPrenda();
    return new Prenda(new Material(tela, trama), tipoPrenda, colorPrimario, colorSecundario);
  }

  private void validarPrenda() {
    if (tela == null || tipoPrenda == null || colorPrimario == null || trama != null) {
      throw new RuntimeException();
    }
  }

}
