package Vehicles.Truk;

import Vehicles.Truk.Truk;

public class Truk_3 extends Truk {
    public Truk_3() {
        super.setGambar("src/img/15.png");
        super.setKecepatanMaksimal(140);
        super.setKec(3);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(2);
    }
}
