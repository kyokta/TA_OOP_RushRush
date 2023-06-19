package Vehicles;

import Vehicles.Truk.Truk;

public interface Kendaraan {
    String gambar="x";

    double kec = 2;
    static void setGambar(String gambar){};
    String getGambar();

    int getY();

    double getKec();

    void setKec(double kec);
    void downKec();
    void upKec();
    void stop();
}
