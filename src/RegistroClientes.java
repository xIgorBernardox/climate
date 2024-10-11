import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroClientes {

    public static void salvarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Número Celular: ");
        String telefone = scanner.nextLine();
        System.out.print("Serviço Requisitado: ");
        String servico = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/clientes.txt", true))) {
            writer.write("Nome: " + nome);
            writer.newLine();
            writer.write("CPF: " + cpf);
            writer.newLine();
            writer.write("Endereço: " + endereco);
            writer.newLine();
            writer.write("Número Celular: " + telefone);
            writer.newLine();
            writer.write("Serviço Requisitado: " + servico);
            writer.newLine();
            writer.write("Requisição do serviço: " + java.time.LocalTime.now() + " " + java.time.LocalDate.now());
            writer.newLine();
            writer.write("-----------------------------");
            writer.newLine();
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar cliente: " + e.getMessage());
        }
    }
}
