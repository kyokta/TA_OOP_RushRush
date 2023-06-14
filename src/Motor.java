import javax.swing.*;

public class Motor extends JFrame implements Kendaraan {
        private int jumlahRoda=2;
        private String nama="Motor";
        private int hp = 15;
        private double bebanMinimal =83;
        private double bebanMaksimal=203;
        private double beban;
        private double kecepatanMaksimal= 110;
        private double kecepatan;
        private static String gambar = "src/img/motor-1.png";

        // for gui
        public Motor(){};

        public static String getGambar() {
            return gambar;
        }

        public void setKecepatan(double kecepatan) {
            this.kecepatan = kecepatan;
        }

        public double getKecepatan() {
            return kecepatan;
        }

        @Override
        public void setKecepatanMaksimal() {
            double power = hp*716;
            this.kecepatanMaksimal = power/beban;
        }

        @Override
        public double getKecepatanMaksimal() {
            return kecepatanMaksimal;
        }

        @Override
        public boolean tambahKecepatan(double tambahKecepatan) {
            if (kecepatanDefault+tambahKecepatan<=kecepatanMaksimal){
                this.kecepatan = kecepatanDefault+tambahKecepatan;
                return true;
            } else{
                return false;
            }
        }

        @Override
        public void setBerat(double beratTambahan) {
            if (bebanMinimal+beratTambahan<bebanMaksimal){
                this.beban = bebanMinimal+bebanMaksimal;
            } else{
                System.out.println("Beban kelebihan");
            }
        }
        @Override
        public double getBerat() {
            return beban;
        }
    }

