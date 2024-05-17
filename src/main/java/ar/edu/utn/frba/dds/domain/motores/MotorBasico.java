package ar.edu.utn.frba.dds.domain.motores;

import ar.edu.utn.frba.dds.clima.ClimaApi;
import ar.edu.utn.frba.dds.domain.Usuario;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;
import java.util.List;

public class MotorBasico extends MotorSugerencias {

  public MotorBasico(ClimaApi climaApi) {
    super(climaApi);
  }

  @Override
  List<Prenda> filtroMotor(Usuario usuario) {
    return usuario.getPrendas();
  }
}
