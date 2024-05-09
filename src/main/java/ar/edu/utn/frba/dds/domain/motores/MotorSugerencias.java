package ar.edu.utn.frba.dds.domain.motores;

import ar.edu.utn.frba.dds.domain.Sugerencia;
import ar.edu.utn.frba.dds.domain.Usuario;
import ar.edu.utn.frba.dds.domain.prenda.Prenda;
import com.google.common.collect.Lists;
import java.util.List;

public abstract class MotorSugerencias {
  public List<Sugerencia>  generarSugerencias(Usuario usuario){

    List<Prenda> prendasValidas = filtroMotor(usuario);

    List<Prenda> superiores = prendasValidas.stream().filter(Prenda::esSuperior).toList();
    List<Prenda> inferiores = prendasValidas.stream().filter(Prenda::esInferior).toList();
    List<Prenda> calzados = prendasValidas.stream().filter(Prenda::esCalzado).toList();

    List<List<Prenda>> combinaciones = Lists.cartesianProduct(superiores,inferiores,calzados);

    return combinaciones.stream().map(comb -> new Sugerencia(comb.get(0),comb.get(1),comb.get(2))).toList();
  }
  abstract List<Prenda> filtroMotor(Usuario usuario);
}
