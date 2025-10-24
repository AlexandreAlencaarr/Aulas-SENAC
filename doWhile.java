import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("login");
        System.out.println("==================");

        System.out.println("usuario");
        String usuario = sc.next();

        System.out.println("senha");
        int senha = sc.nextInt();

        String usuarioTeste;
        int senhaTeste, contador = 0;

        do {
            System.out.println("digite usuario e senha");
            System.out.println("usuarios: ");
            usuarioTeste = sc.next();
            System.out.println("senha: ");
            senhaTeste = sc.nextInt();
            if (usuarioTeste.equals(usuario) && senhaTeste == senha) {
                System.out.println("sucesso");
                System.out.println(contador);
            } else {
                System.out.println("invalido");
                
                contador++;
            }
            if(contador >=3){
                System.out.println("bloqueado");
            }

        } while (!usuarioTeste.equals(usuario) || senhaTeste != senha);

        sc.close();
    }
}
