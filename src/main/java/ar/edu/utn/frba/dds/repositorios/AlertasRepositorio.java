package ar.edu.utn.frba.dds.repositorios;

import ar.edu.utn.frba.dds.domain.Alerta;
import ar.edu.utn.frba.dds.domain.Interesado;
import java.util.ArrayList;
import java.util.List;

public class AlertasRepositorio {
  private List<Alerta> alertas = new ArrayList<>();
  private List<Interesado> interesadosTormenta = new ArrayList<>();
  private List<Interesado> interesadosGranizo = new ArrayList<>();

  public void agregarInteresadoTormenta(Interesado interesado){
    interesadosTormenta.add(interesado);
  }
  public void agregarInteresadosGranizo(Interesado interesado){
    interesadosGranizo.add(interesado);
  }
}
