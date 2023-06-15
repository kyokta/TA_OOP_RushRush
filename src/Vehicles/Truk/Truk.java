package Vehicles.Truk;

import Vehicles.Kendaraan;

import javax.swing.*;

public class Truk extends JFrame implements Kendaraan {
    private String nama;
    private double kecepatanMaksimal;
    private double kecepatanMinimal=50;
    private double kecepatan;
    private static String gambar;

    // for gui
    public Truk() {
    };
    public static void setGambar(String gambar) {
        Truk.gambar = gambar;
    }
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