package Facade;

public class VehicleFactory {

    public static IVehicle createCar(String modelName){
        return new Car(modelName);
    }

    public static IVehicle createShip(String modelName){
        return new Ship(modelName);
    }
}
