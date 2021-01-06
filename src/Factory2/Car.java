package Factory2;

public class Car extends Vehicle {

    Car(String modelName){
        super(modelName);
    }


    @Override
    protected void drive() {
        System.out.println(this.modelName + " drove in to a wall...");
    }
}
