import java.util.Scanner;

public class e20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo;

        System.out.println("saldo inicial");
        saldo = sc.nextDouble();

        int operaçao;
        do {
            System.out.println("\n escolha uma opçao");
            System.out.println("1 - deposito");
            System.out.println("2 - saque");
            System.out.println("3 - sair");
            System.out.println("opçao: ");
            operaçao = sc.nextInt();

            if (operaçao == 1) {
                System.out.println("valor do deposito: ");
                double valor = sc.nextDouble();
                saldo += valor;
            } else if (operaçao == 2) {
                System.out.println("valor do saque: ");
                double valor = sc.nextDouble();
                saldo -= valor;
            }
            System.out.println("saldo atual: " + saldo);
        } while (operaçao != 3);

        System.out.println("\n ====saldo final====");
        if (saldo == 0) {
            System.out.println("CONTA ZERADA");
        } else if (saldo < 0) {
            System.out.println("CONTA ESTOURADA");
        } else {
            System.out.println("CONTA PREFERENCIAL");
        }
        sc.close();
    }
}
