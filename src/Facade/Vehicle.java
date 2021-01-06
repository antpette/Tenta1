package Facade;

public abstract class Vehicle implements IVehicle{

    String modelName;
    public Vehicle(String modelName){
        this.modelName = modelName;
    }

    @Override
    public abstract void drive();

}
