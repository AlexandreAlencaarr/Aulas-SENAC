import java.util.Scanner;

public class e17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero inteiro: ");
        int N = sc.nextInt();
        System.out.println("divisores de " + N);

        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}