public class e10 {
    public static void main(String[] args) {
        int contador = 2;
        double s = 1.0;

        do {
            s += 1.0 / contador;
            contador++;
        } while (contador <= 20);
        System.out.println(s);
    }
}
