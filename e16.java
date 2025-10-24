import java.util.Scanner;

public class e16 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("numero: ");
    int N = sc.nextInt();

    int C = 0;
    do {
        System.out.println("digite o valor #" + (C + 1) + ": ");
        int V = sc.nextInt();

        if (V == 0) {
            System.out.println("NULO");
        }else if(V > 0){
            System.out.println("POSITIVO");
        }else{
            System.out.println("NEGATIVO");
        }

        if (V % 2 == 0) {
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
        C++;
    } while (C < N);
    sc.close();
}
}
