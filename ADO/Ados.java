package ADO;

import java.util.Scanner;

public class Ados {
    public static void main(String[] args) {
        // A1();
        // A2();
        // A3();
        // A4();
        // A5();
        // A6();
    }

    public static void A1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("numero positivo: ");
        int numero = sc.nextInt();

        while (numero <= 0 || numero > 10) {
            System.out.println("digite um numero postiivo menor que ou igual a 10");
            numero = sc.nextInt();
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero * i);
        }
        sc.close();
    }

    public static void A2() {
        Scanner sc = new Scanner(System.in);
        int contagem = 10;
        String confirmação = "";

        while (!confirmação.equals("PRONTO")) {
            System.out.println("Digite PRONTO para iniciar a contagem regressiva:");
            confirmação = sc.nextLine();
        }
        while (contagem > 0) {
            System.out.println("Contagem: " + contagem);
            contagem--;
        }
        if (contagem == 0) {
            System.out.println("Lançamento!");
        }
        sc.close();
    }

    public static void A3() {
        Scanner sc = new Scanner(System.in);
        int contador = 0, notas = 0, soma = 0;
        while (notas != -1) {
            System.out.println("Digite uma nota de 0 a 10 ou -1 para sair: ");
            notas = sc.nextInt();
            if (notas == -1) {
                break;
            }
            soma += notas;
            contador++;
        }
        if (contador > 0) {
            double media = soma / contador;
            System.out.println("A média das notas é: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }
        sc.close();
    }

    public static void A4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void A5() {
        Scanner sc = new Scanner(System.in);
        int senha = 1234;
        int tentativa = 0;
        do {
            System.out.println("Digite a senha: ");
            tentativa = sc.nextInt();
            if (tentativa == senha) {
                System.out.println("permitido");
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
                tentativa = sc.nextInt();
                tentativa++;
            }
        } while (tentativa != senha && tentativa <= 3);
        sc.close();
    }

    public static void A6() {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = 42;
        int tentativasRestantes = 5;
        int palpite;
        boolean acertou = false;

        System.out.println("Adivinhe o número entre 1 e 100 (5 tentativas):");

        while (tentativasRestantes > 0) {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativasRestantes--;

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou em " + (5 - tentativasRestantes) + " tentativas.");
                acertou = true;
                break;
            }

            int diferenca = Math.abs(numeroSecreto - palpite);

            if (diferenca > 20) {
                System.out.println("muito frio, tente um número mais no meio.");
            } else if (diferenca >= 10) {
                System.out.println("frio, você está se aproximando!");
            } else if (diferenca >= 5) {
                System.out.println("quente, você está quase lá!");
            } else {
                if (palpite > numeroSecreto) {
                    System.out.println("muito quente, um pouco menor.");
                } else {
                    System.out.println("muito quente, um pouco maior.");
                }
            }

            System.out.println("Tentativas restantes: " + tentativasRestantes);
        }

        if (!acertou) {
            System.out.println("Game Over! O número secreto era " + numeroSecreto + ".");
        }
        sc.close();
    }
}