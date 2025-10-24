import java.util.Scanner;

public class e18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Proximo;
        System.out.println("digite um numero");
        int N = sc.nextInt();

        if (N < 1 || N >= 46) {
            System.out.println("numero invalido");
        } else {
            int a = 0, b = 1;
            System.out.println("ssequencia: ");

            for (int i = 0; i <= N; i++) {
                System.out.println(a);
                if (i < N) System.out.println(", "); {
                    Proximo = a + b;
                    a = b;
                    b = Proximo;
                }
            }

            sc.close();
        }
    }
}
