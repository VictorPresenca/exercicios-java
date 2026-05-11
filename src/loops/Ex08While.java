package loops;
import java.util.Scanner;

public class Ex08While {
    static void main (String[] args) {

        // criação do objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // variáveis
        int i;
        int c = 0;
        int soma = 0;

        System.out.println("Digite um número");
        int digitados = scanner.nextInt();

        // loop while
        while (digitados > -1) {
            System.out.println("Digite mais um número");
            soma += digitados;
            c++;
            digitados = scanner.nextInt();
        }

        // pseudocódigo
        //
        // escreva 'digite um número';
        // armazene o que o usuário digitar em 'digitados';
        //
        // enquanto (digitados for maior que -1) {
        //      escreva 'digite mais um número';
        //      some 'soma' à 'digitados' e armazene o resultado em 'soma';
        //      conte +1 em 'c';
        //      leia 'digitados'
        // }
        //
        // se ( c for menor que 0 ) {
        //      escreva 'Sem resultados';
        // } else {
        //      escreva 'soma';
        //      escreva 'c';
        //      escreva 'soma' dividido por 'c';
        // }

        // resultados
        if ( c <= 0) {
            System.out.println("Sem resultados");
        } else {
            System.out.println("\nSoma dos digitos: " + soma);
            System.out.println("Quantidade de números digitados " + c);
            System.out.println("Média: " + (double) soma/c);
        }
    }
}
