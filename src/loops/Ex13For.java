package loops;
import java.util.Scanner;
import java.util.Random;

public class Ex13For {
    static void main (String[] args) {

        // scanner
        Scanner scanner = new Scanner(System.in);

        // random
        Random random = new Random();

        // variavel
        int i = 1;
        int n = random.nextInt(10);
        int escolha = 0;

        System.out.println("Foi gerado um número aleatório entre 0 e 10");

        // loop for
        for (i = 1; i <= 3; i++) {

            System.out.println("\nAdivinhe qual foi o número");
            escolha = scanner.nextInt();

            if (escolha == n) {
                System.out.println("Você acertou!!! O número aleatório era: " + n);
                break;
            } else {
                System.out.println(
                        "Errou! Tente novamente.\n" +
                        "Você tem mais " + (3 - i) + " tentativas"
                );
            }
        }

        // Finalização
        if (escolha == n) {
            System.out.println("Parabéns, você é bem sortudo.");
        } else {
            System.out.println(
                    "\nQue pena! o número aleatório era " + n +
                    "\nBloqueado por excesso de tentativas!"
            );
        }

    }
}
