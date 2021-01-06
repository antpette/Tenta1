package Facade;

import java.util.ArrayList;
import java.util.List;

public class TestFacade {

    public static void main(String[] args){
        List<IVehicle> vehicles = new ArrayList<>();

        vehicles.add(VehicleFactory.createCar("volvo240"));
        vehicles.add(VehicleFactory.createCar("saab95"));
        vehicles.add(VehicleFactory.createShip("titanic"));
        vehicles.add(VehicleFactory.createShip("optimist"));

        for(IVehicle v : vehicles)
            v.drive();

    }
}
