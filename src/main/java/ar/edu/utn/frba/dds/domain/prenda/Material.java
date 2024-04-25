package ar.edu.utn.frba.dds.domain.prenda;

public class Material {
  private Tela tela;
  private Trama trama= Trama.LISA;

  public Material(Tela tela, Trama trama) {
    this.tela = tela;
    this.trama = trama;
    if (trama==null){
      this.trama = Trama.LISA;
    }
  }

  public Material(Tela tela) {
    this.tela = tela;
  }

  public Tela getTela() {
    return tela;
  }

  public void setTela(Tela tela) {
    this.tela = tela;
  }

  public Trama getTrama() {
    return trama;
  }

  public void setTrama(Trama trama) {
    this.trama = trama;
  }
}
