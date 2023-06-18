package Vehicles.Bus;

public class Bus_3 extends Bus{
    public Bus_3() {
        super.setGambar("src/img/3.png");
        super.setKec(2.5);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(4);
    }
}
