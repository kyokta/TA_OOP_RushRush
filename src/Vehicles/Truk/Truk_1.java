package Vehicles.Truk;
import Vehicles.Truk.Truk;
public class Truk_1 extends Truk {
    public Truk_1() {
        super.setGambar("src/img/13.png");
        super.setKec(2);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(2);
    }
}
