package loops;
import java.util.Objects;
import java.util.Scanner;

public class Ex09While {
    static void main (String[] args) {

        // objeto
        Scanner scanner = new Scanner(System.in);

        // variaveis
        int i = 0;
        String senha = "";

        System.out.println("Digite a senha para encerrar");
        senha = scanner.next();
        i++;

        if (Objects.equals(senha, "Senha")) {
            System.out.println("Wew, acertou de primeira, tchau!");
        } else {

            // loop do while
            while (!Objects.equals(senha, "Senha")) {
                i++;
                System.out.println("Errou! Tenta de novo");
                senha = scanner.next();
            }

            // mensagem de encerramento
            System.out.println("Acertou em " + i + " tentativas. Tchau");
        }

        /* pseudocódigo
        *
        * digite "digite a senha para encerrar";
        * armazene o que o usuário escrever em 'senha';
        * conte +1 dentro de 'i';
        *
        * se (o objeto 'senha' for igual a "Senha") {
        *       digite "Wew, acertou de primeira, tchau!";
        * } se não {
        *      enquanto (o objeto 'senha' não for igual à "Senha") {
        *           conte +1 em 'i';
        *           digite "Errou! tenta de novo"
        *           armazene o que o usuário escrever em 'senha';
        *      }
        * }
        *
        * digite "tentou em 'i' tentativas, tchau"
        *
        * fim
        *
        * */
    }
}
