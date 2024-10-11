import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LeituraClientes {

    public static void consultarClientes() {
        try (BufferedReader br = new BufferedReader(new FileReader("data/clientes.txt"))) {
            String linha;
            Date dataAtual = new Date();
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");

            System.out.println("\n--- CONSULTA DE CLIENTES ---");
            System.out.println("Data da consulta: " + formatoData.format(dataAtual) + " " + formatoHora.format(dataAtual));
            System.out.println("-----------------------------------");

            while ((linha = br.readLine()) != null) {
                String[] dadosCliente = linha.split(", ");
                String nome = dadosCliente[0];
                String cpf = dadosCliente[1];
                String telefone = dadosCliente[3];
                String endereco = dadosCliente[2];
                String servico = dadosCliente[4];

                System.out.println("\nNome: " + nome);
                System.out.println("CPF: " + cpf);
                System.out.println("Número Celular: " + telefone);
                System.out.println("Endereço: " + endereco);
                System.out.println("Serviço Requisitado: " + servico);
                System.out.println("Requisição do serviço: " + formatoHora.format(dataAtual) + " " + formatoData.format(dataAtual));
                System.out.println("-----------------------------------");
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
