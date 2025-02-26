/*
Este programa ilustra a diferença entre int e double.

Chame esse arquivo de Example3.
*/

public class Exmaple3 {
    public static void main(String[] args) {
        int var; // essa instrução declara uma variável int
        double x;

        var = 10;
        x = 10.0;

        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println(); // exibe uma linha em branco

        var = var / 4;
        x = x / 4;

        System.out.println();
        System.out.println();
    }
}
