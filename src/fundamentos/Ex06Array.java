package fundamentos;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06Array {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] letters = new String[5];

        for (int i = 0; i < letters.length; i++) {
            System.out.println("Digite uma letra");
            letters[i] = scanner.next();
        }

        System.out.println(Arrays.toString(letters));

        scanner.close();

    }
}
