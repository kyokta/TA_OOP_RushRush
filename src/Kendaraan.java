public interface Kendaraan {
    double kecepatanDefault = 60;
    double bensin = 30;
    void setKecepatanMaksimal();
    double getKecepatanMaksimal();
    boolean tambahKecepatan(double tambahKecepatan);
    void setBerat(double beratTambahan);
    double getBerat();
}
