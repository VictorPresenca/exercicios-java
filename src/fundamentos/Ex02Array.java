package fundamentos;

public class Ex02Array {
    public static void main(String[] args){

        int[] array; // cria o array

        array = new int[ 10 ]; // cria o objeto do array

        // gera saída do valor de cada elemento do array
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d\n", counter, array[ counter ]);
    }
}
