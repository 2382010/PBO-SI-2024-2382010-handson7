package Abstraksi;

public class Kendaraan {
    abstract class Kendaraan{
        String warna;

        public Kendaraan(final String warna){
            this.warna = warna;

            abstract class bergerak();

            void info(){
                System.out.println("Warna : " + warna);
            }
        }
    }
}
