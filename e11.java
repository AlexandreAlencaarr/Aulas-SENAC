import java.util.Scanner;

public class e11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double Soma = 0.0;
        System.out.println("digite um numero");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                Soma -= 1.0 / i;
            } else {
                Soma += 1.0 / i;
            }
        }

        System.out.println("resultado: " + Soma);
        sc.close();
    }
}
