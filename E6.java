
import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome, sexo, maisVelhoNome = "", maisVelhoSexo = "";
        int idade, maisVelhoIdade = 0, contador = 1;

        do {
            System.out.println("Aluno " + contador + ":");
            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Idade: ");
            idade = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Sexo: ");
            sexo = sc.nextLine();

            if (idade > maisVelhoIdade) {
                maisVelhoIdade = idade;
                maisVelhoNome = nome;
                maisVelhoSexo = sexo;
            }

            contador++;
        } while (contador <= 5);

        System.out.println("Aluno mais velho:");
        System.out.println("Nome: " + maisVelhoNome);
        System.out.println("Idade: " + maisVelhoIdade);
        System.out.println("Sexo: " + maisVelhoSexo);

        sc.close();
    }
}
