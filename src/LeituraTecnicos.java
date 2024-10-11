import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraTecnicos {

    public static void consultarTecnicos() {
        try (BufferedReader br = new BufferedReader(new FileReader("data/tecnicos.txt"))) {
            String linha;

            System.out.println("\n--- CONSULTA DE TÉCNICOS ---");
            System.out.println("-----------------------------------");

            while ((linha = br.readLine()) != null) {
                String[] dadosTecnico = linha.split(", ");
                String nome = dadosTecnico[0];
                String cpf = dadosTecnico[1];
                String especialidade = dadosTecnico[2];
                String salario = dadosTecnico[3];

                System.out.println("\nNome: " + nome);
                System.out.println("CPF: " + cpf);
                System.out.println("Especialidade: " + especialidade);
                System.out.println("Salário: R$ " + salario);
                System.out.println("-----------------------------------");
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
