package decisao;
import java.util.Scanner;

public class Ex02SwitchCase {
    static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        int n1;
        int n2;
        float calculo;

        System.out.println("Este é um programa de calculadora utilizando switch case\n");

        do {

            System.out.println("Digite dois números para serem calculados");
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();

            System.out.println("Escolha qual tipo de cálculo deseja fazer com esses dois números:\n\n" +
                    "1 - Soma\n" +
                    "2 - Subtração\n" +
                    "3 - Multiplicação\n" +
                    "4 - Divisão\n" +
                    "5 - Sair");
            escolha = scanner.nextInt();

            switch(escolha) {
                case 1:
                    calculo = n1 + n2;
                    System.out.println("\nA soma desses números é: " + calculo +
                            "\n\n 1 - Fazer outro calculo" +
                            "\n 5 - Sair");
                    escolha = scanner.nextInt();
                    break;
                case 2:
                    calculo = n1 - n2;
                    System.out.println("\nA subtração desses números é: " + calculo +
                            "\n\n 1 - Fazer outro calculo" +
                            "\n 5 - Sair");
                    escolha = scanner.nextInt();
                    break;
                case 3:
                    calculo = n1 * n2;
                    System.out.println("\nA multiplicação desses números é: " + calculo +
                            "\n\n 1 - Fazer outro calculo" +
                            "\n 5 - Sair");
                    escolha = scanner.nextInt();
                    break;
                case 4:
                    calculo = (float) n1 / n2;
                    System.out.println("\nA divisão desses números é: " + calculo +
                            "\n\n 1 - Fazer outro calculo" +
                            "\n 5 - Sair");
                    escolha = scanner.nextInt();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
            }
        } while (escolha != 5);
    }
}
