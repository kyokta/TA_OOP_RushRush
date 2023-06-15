package Vehicles.Bus;

import Vehicles.Kendaraan;

import javax.swing.*;

public class Bus extends JFrame implements Kendaraan {
    private String nama;
    private double kecepatanMaksimal;
    private double kecepatanMinimal=70;
    private double kecepatan;
    private static String gambar;

    // for gui
    public Bus() {
    };

    public static void setGambar(String gambar) {
        Bus.gambar = gambar;
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
        if (kecepatanMinimal+ tambahKecepatan <= kecepatanMaksimal) {
            this.kecepatan = kecepatanMinimal + tambahKecepatan;
            return true;
        } else {
            return false;
        }
    }
}
