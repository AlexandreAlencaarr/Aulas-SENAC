
public class E8 {
    public static void main(String[] args) {
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
    
}
