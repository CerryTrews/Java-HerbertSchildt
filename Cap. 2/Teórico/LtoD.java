/*
Demonstra a conversão automática de long para double.
*/

public class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L; // conversaão automática.

        System.out.println("L and D: " + L + " " + D);

        long L1;
        double D1;

        D1 = 100123285.0;
        // L = D; Inválido!! Não há conversão automática de double para long.

        System.out.println(": and D: " + L + " " + D);
    }
}
