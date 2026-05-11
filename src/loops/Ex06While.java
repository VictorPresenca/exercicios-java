package loops;
import java.util.Scanner;

public class Ex06While {
    static void main (String[] args) {

        // criação do objeto scanner
        Scanner scanner = new Scanner(System.in);

        // variável de controle
        int controle = 1;
        int digitados = 0;
        int soma = 0;

        // loop estrutura while
        do {
            System.out.println("Digite um número");
            digitados = scanner.nextInt();
            soma = soma + digitados;
            controle++;
        } while (controle <= 4);

            System.out.println("A soma desses quatro digitos é = " + soma);
    }
}
