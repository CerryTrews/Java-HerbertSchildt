public class QExecDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(11);
        CircularQueue q3 = new CircularQueue(8);


        char ch;
        int i;

        try {
            System.out.println("Testing Fixed queue: ");
            for(i = 0; i < 11; i++) {
                System.out.print("Attempting to store : " + (char) ('A' + i));
                q1.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for(i = 0; i < 11; i++) {
                System.out.print("Getting next char: ");
                ch = q1.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            System.out.println("Testing Dynamic queue: ");
            for(i = 0; i < 11; i++) {
                System.out.print("Attempting to store : " + (char) ('A' + i));
                q2.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for(i = 0; i < 11; i++) {
                System.out.print("Getting next char: ");
                ch = q2.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            System.out.println("Testing Circular queue: ");
            for(i = 0; i < 11; i++) {
                System.out.print("Attempting to store : " + (char) ('A' + i));
                q3.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for(i = 0; i < 11; i++) {
                System.out.print("Getting next char: ");
                ch = q3.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
