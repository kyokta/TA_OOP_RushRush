package Vehicles.Mobil;

public class Mobil_2 extends Mobil{
    public Mobil_2() {
        super.setGambar("src/img/5.png");
        super.setKec(2);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(3.3);
    }
}
