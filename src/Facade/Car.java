package Facade;

public class Car extends Vehicle {

    public Car (String modelName){
        super(modelName);
    }
    @Override
    public void drive() {
        System.out.println(this.modelName + " drives fast as fuck");
    }
}
