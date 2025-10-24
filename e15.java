import java.util.Scanner;

public class e15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("numero: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("numero invalido");
        }else{
            long F = 1;
            for (int i = 1; i <= n; i++) {
                F *= i;
            }
            System.out.println(n + "! = " + F);
        }
        sc.close();
    }
}
