package Vehicles.Mobil;

public class Mobil_1 extends Mobil{
    public Mobil_1() {
        super.setGambar("src/img/5.png");
        super.setKecepatanMaksimal(120);
        super.setKec(2.5);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(2);
    }
}
