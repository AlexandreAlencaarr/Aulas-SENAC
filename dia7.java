import java.util.Scanner;

public class dia7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inicio");
        int inicio = scanner.nextInt();
        int contador = 0;

        System.out.println("fim");
        int fim = scanner.nextInt();
        
        int a = inicio;
        while (a < fim) {
            if(a % 2 == 0){
                System.out.println(a);
                contador++;
            }
            a++;
        }
        System.out.println("vezes " + contador);
        scanner.close();
    }
}
