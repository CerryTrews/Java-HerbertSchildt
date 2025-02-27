// Demonstra coerção.

public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // converte double em int.
        System.out.println("Integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i; // não há perta de informações aqui, um byte pode conter o valor 100.
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i; // dessa vez há perda de informações, um byte não pode conter o valor 257.
        System.out.println("Value of b: " + b);

        b = 88; // ASCII para X
        ch = (char) b; // coerção entre tipos incompatíveis.
        System.out.println("ch: " + ch);
    }
}
