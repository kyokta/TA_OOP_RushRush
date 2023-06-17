package Vehicles.Mobil;

public class Mobil_2 extends Mobil{
    public Mobil_2() {
        super.setGambar("src/img/6.png");
        super.setKecepatanMaksimal(130);
        super.setKec(2);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(2.6);
    }
}
