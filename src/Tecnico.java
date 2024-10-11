public class Tecnico extends Pessoa {
  private String especialidade;
  private double salario;

  public Tecnico(String nome, String cpf, String especialidade, double salario) {
      super(nome, cpf);
      this.especialidade = especialidade;
      this.salario = salario;
  }

  public String getEspecialidade() {
      return especialidade;
  }

  public double getSalario() {
      return salario;
  }

  // Implementação do método exibirInfo()
  @Override
  public void exibirInfo() {
      System.out.println("Nome: " + getNome());
      System.out.println("CPF: " + getCpf());
      System.out.println("Especialidade: " + getEspecialidade());
      System.out.println("Salário: " + getSalario());
  }
}
