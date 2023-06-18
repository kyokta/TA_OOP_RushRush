package Vehicles.Bus;

public class Bus_4 extends Bus{
    public Bus_4() {
        super.setGambar("src/img/4.png");
        super.setKec(3);
    }
    public void downKec(){
        super.setKec(-2);
    }
    public void upKec(){
        super.setKec(5);
    }
}
