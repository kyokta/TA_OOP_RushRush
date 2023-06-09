import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.constant.Constable;

public class Bus extends JFrame implements Kendaraan{
    private int jumlahRoda=6;
    private String nama="Bis Sekul";
    private int hp = 250;
    private double bebanMinimal =3500;
    private double bebanMaksimal=5000;
    private double beban;
    private double kecepatanMaksimal= 260;
    private double kecepatan;
    private static String gambar = "src/img/bus.png";

    // for gui
    public Bus(){};

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
