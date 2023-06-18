package Vehicles.Motor;

public class Motor_4 extends Motor{
    public Motor_4() {
        super.setGambar("src/img/12.png");
        super.setKec(4);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(2);
    }
}
