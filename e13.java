import java.util.Scanner;

public class e13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("numero");
        n = sc.nextInt();
        double soma = 0.0;

        for (int i = 1; i <= n; i++) {
            double n1 = 1.0;
            double n2 = 1.0;

            for (int x = 1; x <= i; x++) {
                n1 *= x;
            }
            for (int x = 1; x <= i; x++) {
                n2 *= (2 * x - 1);
            }

            soma += n1 / n2;
        }
        System.out.println("resultado: " + soma);
        sc.close();
    }
}
