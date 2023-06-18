package Vehicles.Mobil;

public class Mobil_3 extends Mobil{
    public Mobil_3() {
        super.setGambar("src/img/7.png");
        super.setKec(2);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(4);
    }
}
