// O inesperado em uma promoção!

public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; // Certo, mas não é necessária uma coerção.

        b = 10;
        b = (byte) (b * b); // coerção necessária!

        System.out.println("i and b: " + i + " " + b);
    }
}
