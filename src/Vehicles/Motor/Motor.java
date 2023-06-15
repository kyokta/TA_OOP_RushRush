package Vehicles.Motor;

import Vehicles.Kendaraan;

import javax.swing.*;

public class Motor extends JFrame implements Kendaraan {
    private String nama;
    private double kecepatanMaksimal;
    private double kecepatanMinimal=60;
    private double kecepatan;
    private static String gambar;

    // for gui
    public Motor() {
    };
    public static void setGambar(String gambar) {
        Motor.gambar = gambar;
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

