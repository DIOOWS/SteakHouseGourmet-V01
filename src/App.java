import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("*** BEM VINDO AO STEAKHOUSE - CASA DE CARNE GOURMET ***");
        System.out.println();

        while (true) {
            menu.exibirMenu();
            System.out.print("Digite sua escolha: ");

            try {
                int escolha = Integer.parseInt(scanner.nextLine()); // Lê a entrada e converte para número inteiro

                switch (escolha){

                    case 1:
                    System.out.println("Aqui estão as opções de carne do dia:");
                    System.out.println();
                    System.out.println("1 - CONTRA-FILÉ");
                    System.out.println("2 - ALCATRA");
                    System.out.println("3 - PICANHA");
                    System.out.println("4 - CARRÉ");
                    break;

                    case 0:
                        System.out.println("OBRIGADO VOLTE SEMPRE!!!");
                        scanner.close();
                        return; // Encerra o programa
                    default:
                        System.out.println("!! OPA OPÇÃO INVÁLIDA, TENTE NOVAMENTE.");
                }

            }catch (NumberFormatException e){
                System.out.println("Entrada inválida! Por favor, digite apenas números (1 ou 5).");
            }

        }
    }
}
