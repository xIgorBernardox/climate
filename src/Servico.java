public class Servico {
  private String tipoServico;  // Instalação ou Manutenção
  private Tecnico tecnico;
  private Cliente cliente;
  private double preco;

  public Servico(String tipoServico, Tecnico tecnico, Cliente cliente, double preco) {
    this.tipoServico = tipoServico;
    this.tecnico = tecnico;
    this.cliente = cliente;
    this.preco = preco;
  }

  public void exibirDetalhes() {
    System.out.println("Serviço: " + tipoServico);
    tecnico.exibirInfo();
    cliente.exibirInfo();
    System.out.println("Preço: R$" + preco);
  }
}
