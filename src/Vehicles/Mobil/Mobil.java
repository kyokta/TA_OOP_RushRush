package Vehicles.Mobil;

import Vehicles.Kendaraan;

import javax.swing.*;

public class Mobil extends JFrame implements Kendaraan {
    private String nama;
    private double kecepatanMaksimal;
    private double kecepatanMinimal=80;
    private double kecepatan;
    private String gambar;

    // for gui
    public Mobil() {
    };
    public  void setGambar(String gambar) {
        this.gambar = gambar;
    }
    public  String getGambar() {
        return gambar;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    @Override
    public void setKecepatanMaksimal(double kec) {
        this.kecepatanMaksimal = kec;
    }

    @Override
    public double getKecepatanMaksimal() {
        return kecepatanMaksimal;
    }

    @Override
    public boolean tambahKecepatan(double tambahKecepatan) {
        if (kecepatanDefault + tambahKecepatan <= kecepatanMaksimal) {
            this.kecepatan = kecepatanDefault + tambahKecepatan;
            return true;
        } else {
            return false;
        }
    }
}
