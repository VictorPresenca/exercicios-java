package loops;
import java.util.Scanner;

public class Ex11While {
    static void main (String[] args) {

        // FUTURA CALCULADORA

        // objeto scanner
        Scanner scanner = new Scanner(System.in);

        // variáveis
        int escolha;
        int valor1 = 0;
        int valor2 = 0;

        System.out.println(
                "1 - Soma" +
                "\n2 - Subtração" +
                "\n3 - Multiplicação" +
                "\n4 - Divisão" +
                "\n5 - Sair"
        );
        escolha = scanner.nextInt();

        valor1 = scanner.nextInt();
        valor2 = scanner.nextInt();

        // soma
        System.out.println(valor1 + valor2);

        // subtração
        System.out.println(valor1 - valor2);

        // multiplicação
        System.out.println(valor1 * valor2);

        // divisão
        System.out.println(valor1 / valor2);
    }
}
