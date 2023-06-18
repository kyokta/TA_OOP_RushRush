package Vehicles.Truk;

import Vehicles.Kendaraan;

import javax.swing.*;

public class Truk extends JFrame implements Kendaraan {
    private String gambar;
    private  int y = 430;
    private double kec=2;

    // for gui
    public Truk() {
    };
    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
    public String getGambar() {
        return gambar;
    }

    @Override
    public int getY() {
        return y;
    }

    public double getKec() {
        return kec;
    }

    public void setKec(double kec) {
        this.kec = kec+kec;
    }

    public void downKec(){
        setKec(-2);
    }
    public void upKec(){
        setKec(2);
    }

}