package fundamentos;

import java.util.Arrays;
import java.util.Scanner;


public class Ex07Array {
    static void main(String[] args) {

        // criação de objetos para uso no algorítmo
        Scanner scanner = new Scanner(System.in); // scanner
        String[] events = new String[2]; // array

        // loop para solicitar a criação dos nomes dos eventos
        for (int i = 0; i < 2; i++) {
            System.out.println("Crie um evento");
            events[i] = scanner.nextLine(); // armazena cada nome pelo respectívo indice i
        }

        // For-Each, para mostrar as variáveis de cada índice do array
        for (String evento : events) {
            System.out.println(evento);
        }

        // fechar o scanner, trás profissionalidade para o código
        // e previne de gastar RAM atoa durante a execução
        scanner.close();

    }
}
