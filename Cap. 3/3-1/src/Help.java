public class Help {
    // Um sistema de ajuda simples.

    public static void main(String[] args) throws java.io.IOException {
        char choice;

        System.out.println("Help on:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.print("Choose one: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch(choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) {\n   statement;\n}");
                System.out.println("else {\n    statement;\n}");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("  case constant:");
                System.out.println("    statement sequence");
                System.out.println("    break;");
                System.out.println("    //...");
                System.out.println("}");
            default:
                System.out.println("Selection not found.");
        }
    }
}
