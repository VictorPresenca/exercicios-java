package fundamentos;

import java.util.Scanner;

public class Ex05Array {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array;
        array = new int[10];

        System.out.println("Escreva um número para armazenar no array");
        array [0] = scanner.nextInt();

        System.out.println(array[0]);
    }
}
