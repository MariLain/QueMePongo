package ar.edu.utn.frba.dds.repositorios;

import ar.edu.utn.frba.dds.domain.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuariosRepository {
  private List<Usuario> usuarios = new ArrayList<>();

  public void agregarUsuario(Usuario usuario){
    usuarios.add(usuario);
  }

  public void calcularAtuendoDiario(){
    usuarios.forEach(Usuario::calcularAtuendoDiario);
  }
}
