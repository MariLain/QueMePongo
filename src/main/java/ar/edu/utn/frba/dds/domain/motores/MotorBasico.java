package ar.edu.utn.frba.dds.domain.motores;

import ar.edu.utn.frba.dds.domain.Usuario;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;
import java.util.List;

public class MotorBasico extends MotorSugerencias{

  @Override
  List<Prenda> filtroMotor(Usuario usuario) {
    return usuario.getPrendas();
  }
}
