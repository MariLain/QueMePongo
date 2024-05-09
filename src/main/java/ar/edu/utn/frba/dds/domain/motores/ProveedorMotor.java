package ar.edu.utn.frba.dds.domain.motores;

public class ProveedorMotor {
  private MotorSugerencias motorSugerencias;

  public ProveedorMotor(MotorSugerencias motorSugerencias) {
    this.motorSugerencias = motorSugerencias;
  }

  public MotorSugerencias getMotorSugerencias() {
    return motorSugerencias;
  }

  public void setMotorSugerencias(MotorSugerencias motorSugerencias) {
    this.motorSugerencias = motorSugerencias;
  }
}
