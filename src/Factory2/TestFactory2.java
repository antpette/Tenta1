package Factory2;

import java.util.ArrayList;
import java.util.List;

public class TestFactory2 {

    public static void main(String[] args){
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(VehicleFactory.createCar("volvo240"));
        vehicles.add(VehicleFactory.createCar("saab95"));

        for(Vehicle v: vehicles)
            v.drive();

    }
}
