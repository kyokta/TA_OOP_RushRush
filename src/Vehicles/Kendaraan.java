package Vehicles;

public interface Kendaraan {
//    double kecepatanDefault = 60;
    void setKecepatanMaksimal(double kec);
    double getKecepatanMaksimal();
    boolean tambahKecepatan(double tambahKecepatan);
}
