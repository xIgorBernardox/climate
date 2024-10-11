public abstract class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // Declaração do método abstrato exibirInfo()
    public abstract void exibirInfo();  // Método abstrato que deve ser implementado pelas subclasses
}
