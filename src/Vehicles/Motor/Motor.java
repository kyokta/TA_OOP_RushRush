package Vehicles.Motor;

import Vehicles.Kendaraan;

import javax.swing.*;

public class Motor extends JFrame implements Kendaraan {
    private  String gambar;
    private  int y = 340;
    private double kec=2;

    // for gui
    public Motor() {
    };
    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
    public  String getGambar() {
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

