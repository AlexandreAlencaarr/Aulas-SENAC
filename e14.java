import java.util.Scanner;

public class e14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("numero: ");
        int n = sc.nextInt();
        double soma = 0.0;

        for (int i = 1; i <= n; i++) {
            soma += (2.0 * i) / (2 * i + 1);
        }
        System.out.println("resultado: " + soma);
        sc.close();
    }
}
