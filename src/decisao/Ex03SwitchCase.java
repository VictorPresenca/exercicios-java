package decisao;
import java.util.Scanner;

public class Ex03SwitchCase {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;

        System.out.println("\nEsse é um aplicativo de tarefas");

        do {
            System.out.println("1 - Adicionar uma tarefa\n" +
                    "2 - Listar tarefas\n" +
                    "3 - Remover tarefas\n" +
                    "0 - Sair");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        } while (escolha != 0);
    }
}
