package ar.edu.utn.frba.dds.domain.motores;

import ar.edu.utn.frba.dds.clima.ClimaApi;
import ar.edu.utn.frba.dds.domain.Atuendo;
import ar.edu.utn.frba.dds.domain.Usuario;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;
import com.google.common.collect.Lists;
import java.util.List;

public abstract class MotorSugerencias {

  private ClimaApi climaApi;

  public MotorSugerencias(ClimaApi climaApi) {
    this.climaApi = climaApi;
  }

  public List<Atuendo> generarSugerencias(Usuario usuario) {

    List<Prenda> prendasValidas = filtroTemperatura(filtroMotor(usuario), usuario.getCuidad());

    List<Prenda> superiores = prendasValidas.stream().filter(Prenda::esSuperior).toList();
    List<Prenda> inferiores = prendasValidas.stream().filter(Prenda::esInferior).toList();
    List<Prenda> calzados = prendasValidas.stream().filter(Prenda::esCalzado).toList();

    List<List<Prenda>> combinaciones = Lists.cartesianProduct(superiores, inferiores, calzados);

    return combinaciones.stream()
        .map(comb -> new Atuendo(comb.get(0), comb.get(1), comb.get(2))).toList();
  }

  abstract List<Prenda> filtroMotor(Usuario usuario);

  private List<Prenda> filtroTemperatura(List<Prenda> prendas, String ciudad) {
    double temperatura = climaApi.temperatura(ciudad);
    return prendas.stream().filter(p -> p.getTemperaturaMax() <= temperatura).toList();
  }
}
