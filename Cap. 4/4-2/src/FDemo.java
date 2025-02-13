public class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    @Override
    protected void finalize() {
        System.out.println("Finalizing " + x);
    }

    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}
