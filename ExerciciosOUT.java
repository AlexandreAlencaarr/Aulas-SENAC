import java.util.Scanner;

class ExerciciosOUT {
    static void main(String[] args) {
        // e1();
        // e2();
        // e3();
        // e4();
        // e5();
        // e6();
        // e7();
        // e8();
        e9();
        // e10();
        // e11();
        // e12();
        // e13();
        // e14();
        // e15();
    }

    static void e1() {
        int Num = 0;
        while (Num != 50) {
            Num++;
            System.out.println(Num);
        }
    }

    static void e2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite número:");
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

    static void e3() {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        for (int a = 1; a <= 10; a++) {
            System.out.println("Digite o " + a + "º número:");
            int numero = sc.nextInt();
            if (numero > maior)
                maior = numero;
        }
        System.out.println("Maior número é: " + maior);
        sc.close();
    }

    static void e4() {
        for (int a = 0; a < 1000; a += 10) {
            System.out.println(a);
        }
    }

    static void e5() {
        for (int a = 100; a > 1; a--) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }

    static void e6() {
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

    static void e7() {
        int n = 7;
        while (n < 200) {
            if (n % 7 == 0)
                System.out.println(n);
            n++;
        }
    }

    static void e8() {
        int soma = 0, contador = 0;
        for (int i = 13; i <= 73; i++) {
            if (i % 2 == 0) {
                soma += i;
                contador++;
                System.out.println(i);
            }
        }
        double media = (double) soma / contador;
        System.out.println("Média: " + media);
    }

    static void e9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos?");
        int Alunos = sc.nextInt();
        int contador = 1;
        while (contador <= Alunos) {
            System.out.println("aluno " + contador + ":");
            System.out.println("nota 1:");
            double nota1 = sc.nextDouble();

            System.out.println("nota 2:");
            double nota2 = sc.nextDouble();

            System.out.println("nota 3:");
            double nota3 = sc.nextDouble();
            contador++;

            double Media = (nota1 + nota2 + nota3) / 3;
            System.out.println("média do aluno: " + Media);
        }
        sc.close();
    }

    static void e10() {
        
    }
}
