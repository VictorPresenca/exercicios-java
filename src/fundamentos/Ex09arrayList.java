package fundamentos;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex09arrayList {

    // ArrayList com eventos

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> events = new ArrayList<>();

        int escolha = 0;

        do {
            System.out.println("crie um nome para o evento");
            events.add(scanner.nextLine());

            System.out.println("Deseja adicionar mais um evento?" +
                    "0 - Não" +
                    "1 - Sim");
            escolha = scanner.nextInt();
            scanner.nextLine();

        } while (escolha != 0);

        for (String eventos : events) {
            System.out.println(eventos);
        }

        scanner.close();
    }
}
