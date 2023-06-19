package Vehicles.Bus;

import Vehicles.Kendaraan;

import javax.swing.*;

public class Bus extends JFrame implements Kendaraan {
    private String gambar;
    private  int y = 520;

    private double kec=2;

    // for gui
    public Bus() {
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

    public void setY(int y) {
        this.y = y;
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

    @Override
    public void stop() {
        setKec(0);
    }
}
