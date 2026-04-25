package fundamentos;

public class Ex03Array {
    static void main(String[] args) {
        // lista de inicializador especifica o valor de cada elemento
        int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37, 10 };

        System.out.printf("%s%8s\n", "Index", "Value"); // títulos de coluna

        // gera saída do valor de cada elemento do array
        for ( int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d\n", counter, array [ counter] );
    }
}
