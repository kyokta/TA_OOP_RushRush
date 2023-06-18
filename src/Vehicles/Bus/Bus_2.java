package Vehicles.Bus;

public class Bus_2 extends Bus{
    public Bus_2() {
        super.setGambar("src/img/2.png");
        super.setKec(2.5);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(3);
    }
}
