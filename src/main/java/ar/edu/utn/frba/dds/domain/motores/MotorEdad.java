package ar.edu.utn.frba.dds.domain.motores;

import ar.edu.utn.frba.dds.domain.Usuario;
import ar.edu.utn.frba.dds.domain.prenda.Formalidad;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;
import java.util.List;

public class MotorEdad extends MotorSugerencias {

  @Override
  List<Prenda> filtroMotor(Usuario usuario) {
    if(usuario.getEdad()>55){
      return usuario.getPrendas().stream().filter(p-> p.getFormalidad() == Formalidad.INFORMAL).toList();
    }
    return usuario.getPrendas();
  }
}
