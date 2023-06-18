package Vehicles.Mobil;

public class Mobil_1 extends Mobil{
    public Mobil_1() {
        super.setGambar("src/img/6.png");
        super.setKec(2.5);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(3);
    }
}
