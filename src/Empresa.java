import java.util.ArrayList;

public class Empresa {
    private String nome;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Tecnico> tecnicos = new ArrayList<>();
    private ArrayList<Servico> servicos = new ArrayList<>();

    public Empresa(String nome) {
      this.nome = nome;
    }

    public void adicionarCliente(Cliente cliente) {
      clientes.add(cliente);
    }

    public void adicionarTecnico(Tecnico tecnico) {
      tecnicos.add(tecnico);
    }

    public void adicionarServico(Servico servico) {
      servicos.add(servico);
    }

    public void exibirServicos() {
      for (Servico servico : servicos) {
        servico.exibirDetalhes();
      }
    }
}
