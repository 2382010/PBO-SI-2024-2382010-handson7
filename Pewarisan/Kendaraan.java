package Pewarisan;

public class Kendaraan {
    private String merek;
    private String model;
    private String tahunProduksi;

    public Kendaraan(String merek, String model, String tahunProduksi) {
        this.merek = merek;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    public void tampilkanInfo(){
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi : " +tahunProduksi);
    }
}
