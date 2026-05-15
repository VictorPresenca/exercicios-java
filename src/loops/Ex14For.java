package loops;
import java.util.Scanner;

public class Ex14For {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        System.out.println("Este é um programa de somatório de números pares. Se você digitar números ímpares, não vão ser somados");

        for (int i = 1; i <= 5; i++) {

            int n = 0;

            System.out.println("Digite um número PAR");
            n = scanner.nextInt();

            if (n % 2 != 0){
                System.out.println("Esse não é par, jegue. Não foi somado");
                continue; // Volte para o inicio!
            }

            // O continue serve para reiniciar o loop, encerrando antes de ler o código inteiro dentro do loop.

            soma += n;
            System.out.println("Boa. Esse é par. Foi somado. Próximo" + "\nFaltam " + (5 - i));
        }

        System.out.println("A soma é " + soma);
    }
}
