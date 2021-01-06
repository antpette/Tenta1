package Factory2;

public class VehicleFactory {


    public static Vehicle createCar(String modelName){
        return new Car(modelName);
    }

}
