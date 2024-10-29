package contohKelaspertama;

public class Mobil {
    String warna;
    String merek;
    int KecepatanMaks;

    public Mobil(String warna, String merek, int kecepatanMaks) {
        this.warna = warna;
        this.merek = merek;
        this.KecepatanMaks = kecepatanMaks;
    }

    public void tampilkanInfo(){
        System.out.println("Warna: " + warna);
        System.out.println("Merek: " + merek);
        System.out.println("KecepatanMaks: " + KecepatanMaks);
    }

    public String getWarna(){
        return warna;
    }

    public String getMerek(){
        return merek;
    }

    public int getKecepatanMaks(){
        return KecepatanMaks;
    }
     public void setwarna(String warna){
        this.warna = warna;
     }

     public void setMerek(String Merek){
        this.merek = merek;
     }

     public void setKecepatanMaks(int kecepatanMaks){
        this.KecepatanMaks = kecepatanMaks;
     }
}
