public class Truck extends Vehicle{
    private int cargocap;

    Truck(int p, int f, int m, int c) {
        super(p, m, f);
        cargocap = c;
    }

    int getCargo() {
        return cargocap;
    }

    void putCargo(int c) {
        cargocap = c;
    }

}
