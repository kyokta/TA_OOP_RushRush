package Vehicles.Mobil;

public class Mobil_4 extends Mobil{
    public Mobil_4() {
    }
    public void setGambar(){
        super.setGambar("src/img/8.png");
        super.setKec(2);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(3.5);
    }
}
