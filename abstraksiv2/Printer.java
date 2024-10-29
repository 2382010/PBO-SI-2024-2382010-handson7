package abstraksiv2;

public class Printer implements Cetak {
    @Override
    public void print() {
        System.out.println("Mencetal....");
    }

    @Override
    public void scan() {
        System.out.println("Memindai....");
    }
}
