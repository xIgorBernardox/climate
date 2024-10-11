import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraTecnicos {
    public static void consultarTecnicos() {
        try (BufferedReader reader = new BufferedReader(new FileReader("data/tecnicos.txt"))) {
            String linha;
            System.out.println("\n--- Técnicos Registrados ---");
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de técnicos: " + e.getMessage());
        }
    }
}
