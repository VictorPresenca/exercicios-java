package decisao;
import java.util.Scanner;

public class Ex01SwitchCase {
    static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite um número de 1 a 7 - 5 vezes");
            n = scanner.nextInt();

            switch (n){
                case 1:
                    System.out.println("Domingo\n");
                    break;
                case 2:
                    System.out.println("Segunda\n");
                    break;
                case 3:
                    System.out.println("Terça\n");
                    break;
                case 4:
                    System.out.println("Quarta\n");
                    break;
                case 5:
                    System.out.println("Quinta\n");
                    break;
                case 6:
                    System.out.println("Sexta\n");
                    break;
                case 7:
                    System.out.println("Sábado\n");
                    break;
                default:
                    System.out.println("número inválido\n");
            }
        }
    }
}
