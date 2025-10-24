import java.util.Scanner;

public class e19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        System.out.println("digite a senha: ");
        int Tentativa = sc.nextInt();
        while(Tentativa != senha){
            System.out.println("senha invalida, tente novamente: ");
            Tentativa = sc.nextInt();
            if (Tentativa == senha) {
                System.out.println("Acesso Permitido!");
            }
        }
        sc.close();
    }
}
