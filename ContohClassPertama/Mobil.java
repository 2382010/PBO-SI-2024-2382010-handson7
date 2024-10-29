package ContohClassPertama;

public class Mobil {
    String warna;
    String merek;
    int kecepatanMaks;

    public Mobil(String merek, String warna, int kecepatanMaks) {
        this.merek = merek;
        this.warna = warna;
        this.kecepatanMaks = kecepatanMaks;
    }
    public tampilkanInfo() {
        System.out.println("Warna : " + warna);
        System.out.println("Merek : " + merek);
        System.out.println("KecepatanMaks : " + kecepatanMaks);
    }
}

