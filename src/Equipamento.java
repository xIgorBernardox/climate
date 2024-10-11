public abstract class Equipamento {
  protected String marca;
  protected double potencia;

  public Equipamento(String marca, double potencia) {
    this.marca = marca;
    this.potencia = potencia;
  }

  public abstract void exibirInfoEquipamento();
}
