package loops;
import java.util.Scanner;

public class Ex10While {
    static void main (String[] args) {

        // objeto scanner
        Scanner scanner = new Scanner(System.in);

        // variaveis
        int escolha = 1;

        do {
            System.out.println(
                    "1 - escolha 1" +
                    "\n2 - escolha 2" +
                    "\n0 - sair"
            );
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println(
                        "Você fez a escolha 1"
                );
            } else if (escolha == 2) {
                System.out.println(
                        "Você fez a escolha 2"
                );
            } else if (escolha != 0){
                System.out.println(
                        "Faça uma escolha válida. Essa não existe"
                );
            }
        } while (escolha != 0);

        System.out.println("fim!");
    }
}
