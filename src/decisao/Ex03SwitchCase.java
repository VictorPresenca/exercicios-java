package decisao;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex03SwitchCase {
    static void main(String[] args) {

        // instância de objetos
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        int escolha;

        System.out.println("\nEsse é um aplicativo de tarefas");

        do {
            System.out.println(
                    "\n1 - Adicionar uma tarefa\n" +
                    "2 - Listar tarefas\n" +
                    "3 - Remover tarefas\n" +
                    "0 - Sair");
            escolha = scanner.nextInt();

            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("\nCrie um nome para o evento");
                    tarefas.add(scanner.nextLine());
                    break;
                case 2:
                    System.out.println(" ---- Lista de eventos ---- ");
                    for (String listaDeTarefas : tarefas) {
                        System.out.println(listaDeTarefas);
                    }
                    break;
                case 3:
                    System.out.println(" ---- Lista de eventos ---- ");
                    for (String listaDeTarefas : tarefas) {
                        System.out.println(listaDeTarefas);
                    }
                        System.out.println("\n\nEscreva o nome do evento gostaria de excluir?");
                        boolean removido = tarefas.remove(scanner.nextLine());

                        if (!removido) {
                            System.out.println("\nDigitou o nome errado. Exclusão falhou!");
                        }
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Digite uma escolha válida! Essa não existe.");
                    break;
            }
        } while (escolha != 0);

        scanner.close();
    }
}
