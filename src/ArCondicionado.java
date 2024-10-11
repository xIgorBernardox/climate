public class ArCondicionado extends Equipamento {
  private double capacidadeBTU;

  public ArCondicionado(String marca, double potencia, double capacidadeBTU) {
    super(marca, potencia);
    this.capacidadeBTU = capacidadeBTU;
  }

  @Override
  public void exibirInfoEquipamento() {
    System.out.println("Ar Condicionado - Marca: " + marca + ", Potência: " + potencia + "W, Capacidade: " + capacidadeBTU + " BTU");
  }
}
