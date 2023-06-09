import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mobil extends JFrame implements Kendaraan{
    private int jumlahRoda=4;
    private String nama="Pajero Sport";
    private int hp = 134;
    private double bebanMinimal =500;
    private double bebanMaksimal=800;
    private double beban;
    private double kecepatanMaksimal=130;
    private double kecepatan;

    private static String gambar = "src/img/carfiks.png";


    // for gui
    public Mobil(){};

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
