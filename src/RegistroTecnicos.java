import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroTecnicos {

    public static void salvarTecnico() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Especialidade: ");
        String especialidade = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();  // Consumir a quebra de linha

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/tecnicos.txt", true))) {
            writer.write("Nome: " + nome);
            writer.newLine();
            writer.write("CPF: " + cpf);
            writer.newLine();
            writer.write("Especialidade: " + especialidade);
            writer.newLine();
            writer.write("Salário: " + salario);
            writer.newLine();
            writer.write("-----------------------------");
            writer.newLine();
            System.out.println("Técnico cadastrado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar técnico: " + e.getMessage());
        }
    }
}
