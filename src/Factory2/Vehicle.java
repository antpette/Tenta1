package Factory2;

public abstract class Vehicle {
    String modelName;

     Vehicle(String modelName){
        this.modelName = modelName;
    }

    protected abstract void drive();
}
