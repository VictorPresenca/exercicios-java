package loops;
import java.util.Scanner;

public class Ex11While {
    static void main (String[] args) {

        // objeto scanner
        Scanner scanner = new Scanner(System.in);

        // variáveis
        int escolha;
        double valor1 = 0;
        double valor2 = 0;

        do {

            System.out.println("\nVamos calcular! Digite dois valores para fazermos calculos básicos\n");

            System.out.println("Digite o primeiro valor");
            valor1 = scanner.nextInt();

            System.out.println("Digite o segundo valor");
            valor2 = scanner.nextInt();

            System.out.println(
                    "1 - Soma" +
                    "\n2 - Subtração" +
                    "\n3 - Multiplicação" +
                    "\n4 - Divisão" +
                    "\n5 - Sair"
            );
            escolha = scanner.nextInt();

            if (escolha == 1) {

                // soma
                System.out.println(
                        "A soma dos valores digitados é: " + (valor1 + valor2) +
                        "\n1 - Fazer outro cálculo" +
                        "\n5 - Sair"
                        );
                escolha = scanner.nextInt();

            } else if (escolha == 2) {

                // subtração
                System.out.println(
                        "A subtração dos valores digitados é: " + (valor1 - valor2) +
                                "\n1 - Fazer outro cálculo" +
                                "\n5 - Sair"
                );
                escolha = scanner.nextInt();

            } else if (escolha == 3) {

                // multiplicação
                System.out.println(
                        "A multiplicação dos valores digitados é: " + (valor1 * valor2) +
                                "\n1 - Fazer outro cálculo" +
                                "\n5 - Sair"
                );
                escolha = scanner.nextInt();

            } else if (escolha == 4) {

                // divisão
                System.out.println(
                        "A divisão dos valores digitados é: " + (valor1 / valor2) +
                                "\n1 - Fazer outro cálculo" +
                                "\n5 - Sair"
                );
                escolha = scanner.nextInt();

            } else if (escolha != 0) {

                System.out.println("Escolha uma opção válida. Essa não existe!");

            }

        } while (escolha != 5);

    }
}
