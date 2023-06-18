package UI;

import Vehicles.Bus.Bus_1;
import Vehicles.Bus.Bus_2;
import Vehicles.Bus.Bus_3;
import Vehicles.Bus.Bus_4;
import Vehicles.Kendaraan;
import Vehicles.Mobil.Mobil_1;
import Vehicles.Mobil.Mobil_2;
import Vehicles.Mobil.Mobil_3;
import Vehicles.Mobil.Mobil_4;
import Vehicles.Motor.Motor_1;
import Vehicles.Motor.Motor_2;
import Vehicles.Motor.Motor_3;
import Vehicles.Motor.Motor_4;
import Vehicles.Truk.Truk_1;
import Vehicles.Truk.Truk_2;
import Vehicles.Truk.Truk_3;
import Vehicles.Truk.Truk_4;

import java.util.Dictionary;
import java.util.Hashtable;

public class ParentRace {
    static Dictionary<Integer, Kendaraan> dict= new Hashtable<>();
    static void addDict(){
        dict.put(0, new Motor_1());
        dict.put(1, new Mobil_1());
        dict.put(2, new Motor_2());
        dict.put(3, new Mobil_2());
        dict.put(4, new Truk_1());
        dict.put(5, new Bus_1());
        dict.put(6, new Truk_2());
        dict.put(7, new Bus_2());

        dict.put(8, new Motor_3());
        dict.put(9, new Mobil_3());
        dict.put(10, new Motor_4());
        dict.put(11, new Mobil_4());
        dict.put(12, new Truk_3());
        dict.put(13, new Bus_3());
        dict.put(14, new Truk_4());
        dict.put(15, new Bus_4());
    }
}
