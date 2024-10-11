public class Ventilacao extends Equipamento {
  private double areaCobertura;

  public Ventilacao(String marca, double potencia, double areaCobertura) {
    super(marca, potencia);
    this.areaCobertura = areaCobertura;
  }

  @Override
  public void exibirInfoEquipamento() {
    System.out.println("Ventilação - Marca: " + marca + ", Potência: " + potencia + "W, Área de Cobertura: " + areaCobertura + " m²");
  }
}
