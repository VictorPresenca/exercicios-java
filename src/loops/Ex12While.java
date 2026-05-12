package loops;
import java.util.Scanner;

public class Ex12While {
    static void main(String[] args) {

        // objeto scanner
        Scanner scanner = new Scanner(System.in);

        // variaveis
        int escolha = 0;
        double saldo = 0;

        do {
            System.out.println(
                    """
                            1 - Ver saldo
                            2 - Sacar
                            3 - Depositar
                            4 - Sair"""
            );
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println(
                        "Seu saldo atual é: R$" + saldo +
                        "\n0 - Voltar"
                );
                escolha = scanner.nextInt();
            } else if (escolha == 2) {

                int saque = 0;
                System.out.println("Saque um valor");
                saque = scanner.nextInt();

                if (saque < saldo) {
                    saldo -= saque;
                    System.out.println(
                            "Saque realizado com sucesso!" +
                            "\n0 - Voltar"
                    );
                    escolha = scanner.nextInt();
                }else {
                    System.out.println("Saldo insuficiênte!");
                }
            } else if (escolha == 3) {

                int deposito = 0;
                System.out.println("Digite um valor para depósito");
                deposito = scanner.nextInt();

                if (deposito > 0) {
                    saldo += deposito;
                    System.out.println(
                            "Depósito de R$" + deposito + " realizado com sucesso!" +
                            "\n0 - Voltar"
                    );
                    escolha = scanner.nextInt();
                } else {
                    System.out.println("Depósito inválido!");
                }

            } else if (escolha != 4) {
                System.out.println("Escolha uma opção existente. Essa não existe");
            }

        } while (escolha != 4);

    }
}
