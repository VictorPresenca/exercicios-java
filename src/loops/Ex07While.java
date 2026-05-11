package loops;
import java.util.Scanner;

public class Ex07While {
    static void main (String[] args){

        // criação do objeto scanner
        Scanner scanner = new Scanner(System.in);

        // criação das variáveis
        int digitados = 0;
        int soma = 0;

        // mensagem de pausa do código
        System.out.println("Quando quiser encerrar, digite 0");

        // loop while
        do {
            System.out.println("Digite um número para soma");
            digitados = scanner.nextInt();
            soma += digitados;

        }while (digitados != 0);

        // pseudocódigo
        // faça {
        //      escreva "Digite um número para soma";
        //      armazene o que for digitado na variável digitados;
        //      some as variáveis 'soma' e 'digitados' e armaezene em 'soma';
        // enquanto (digitados não for 0);

        // mensagem final
        System.out.println("O resultado da soma destes números digitados é: " + soma);

    }
}
