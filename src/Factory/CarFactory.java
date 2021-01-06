package Factory;

public class CarFactory implements IVehicleFactory {

    public Car create(){
        System.out.println("Car created");
        return new Car();
    }
}
