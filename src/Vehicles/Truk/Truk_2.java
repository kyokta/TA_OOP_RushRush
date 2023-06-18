package Vehicles.Truk;

import Vehicles.Truk.Truk;

public class Truk_2 extends Truk {
    public Truk_2() {
        super.setGambar("src/img/14.png");
        super.setKec(2.5);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(3);
    }
}
