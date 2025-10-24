import java.util.Scanner;

public class e12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double Soma = 0.0;

        System.out.println("digite um numero");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            Soma += (double) i / (n - i + 1);
        }

        System.out.println("resultado: " + Soma);
        sc.close();
    }
}