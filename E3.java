
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        for (int a = 1; a <= 10; a++) {
            System.out.println("digite o " + a + " numero");
            int numero =sc.nextInt();
            
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("maior numero é: " + maior);
        sc.close();
    }
}
