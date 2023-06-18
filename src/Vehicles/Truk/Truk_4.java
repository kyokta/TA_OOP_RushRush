package Vehicles.Truk;

import Vehicles.Truk.Truk;

public class Truk_4 extends Truk {
    public Truk_4() {
        super.setGambar("../img/16.png");
        super.setKec(3.5);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(2);
    }
}
