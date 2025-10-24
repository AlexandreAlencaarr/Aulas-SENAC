import java.util.Scanner;

public class e21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int Num = sc.nextInt();
        int soma = 0;

        for (int i = 1; i < Num; i++) {
            if(Num % i == 0){
                soma += i;
            }
        }
        if(soma == Num){
            System.out.println(Num + "  perfeito");
        } else {
            System.out.println(Num + " nao perfeito");
        }
    sc.close();
    }
}
