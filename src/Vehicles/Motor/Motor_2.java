package Vehicles.Motor;

public class Motor_2 extends Motor{
    public Motor_2() {
        super.setGambar("src/img/10.png");
        super.setKec(3);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(3);
    }
}
