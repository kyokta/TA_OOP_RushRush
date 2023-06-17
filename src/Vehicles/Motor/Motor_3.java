package Vehicles.Motor;

public class Motor_3 extends Motor{
    public Motor_3() {
        super.setGambar("src/img/11.png");
        super.setKecepatanMaksimal(120);
        super.setKec(3.5);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(2);
    }
}
