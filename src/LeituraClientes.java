import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraClientes {
    public static void consultarClientes() {
        try (BufferedReader reader = new BufferedReader(new FileReader("data/clientes.txt"))) {
            String linha;
            System.out.println("\n--- Clientes Registrados ---");
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de clientes: " + e.getMessage());
        }
    }
}
