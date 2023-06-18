package Vehicles.Motor;

public class Motor_1 extends Motor{
    public Motor_1() {
        super.setGambar("src/img/9.png");
        super.setKec(2);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(2);
    }
}
