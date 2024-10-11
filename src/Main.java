import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Funcionário");
            System.out.println("3 - Consultar Clientes Registrados");
            System.out.println("4 - Consultar Funcionários Registrados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  
            switch (opcao) {
                case 1:
                    RegistroClientes.salvarCliente();  
                    break;
                case 2:
                    RegistroTecnicos.salvarTecnico(); 
                    break;
                case 3:
                    LeituraClientes.consultarClientes();
                    break;
                case 4:
                    LeituraTecnicos.consultarTecnicos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        
        scanner.close();
    }
}
