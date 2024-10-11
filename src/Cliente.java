public class Cliente extends Pessoa {
  private String telefone;
  private String endereco;
  private String servico;

  public Cliente(String nome, String cpf, String endereco, String telefone, String servico) {
      super(nome, cpf);
      this.telefone = telefone;
      this.endereco = endereco;
      this.servico = servico;
  }

  public String getTelefone() {
      return telefone;
  }

  public String getEndereco() {
      return endereco;
  }

  public String getServico() {
      return servico;
  }

  @Override
  public void exibirInfo() {
      System.out.println("Nome: " + getNome());
      System.out.println("CPF: " + getCpf());
      System.out.println("Telefone: " + getTelefone());
      System.out.println("Endereço: " + getEndereco());
      System.out.println("Serviço: " + getServico());
  }
}
