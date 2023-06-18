package Vehicles.Bus;

public class Bus_1 extends Bus{
    public Bus_1() {
        super.setGambar("src/img/13.png");
        super.setKec(2.5);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(5);
    }
}
