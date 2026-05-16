package fundamentos;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex09arrayList {

    // ArrayList com eventos

    static void main(String[] args) {

        // instancia de objetos
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> events = new ArrayList<>();

        // variáveis
        int escolha = 0;

        // estrutura de repetição de criação de eventos
        do {
            System.out.println("crie um nome para o evento");
            events.add(scanner.nextLine());

            System.out.println("Deseja adicionar mais um evento?\n" +
                    "\n0 - Não" +
                    "\n1 - Sim");
            escolha = scanner.nextInt();
            scanner.nextLine();

        } while (escolha != 0);

        // for-each específico para mostrar todos atributos da arraylist
        for (String eventos : events) {
            System.out.println(eventos);
        }

        scanner.close(); // fechamento do scanner para não consumir memória atoa
    }
}
