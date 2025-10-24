
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite numero");
        int Num = scanner.nextInt();
        int Soma = 0;
        int i = 0;

        while (i <= Num) {
            Soma += i;
            i++; 
        }
        System.out.println(Soma);
        scanner.close();
    }
}
