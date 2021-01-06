package Facade;

public class Ship extends Vehicle{

    public Ship( String modelName){
        super(modelName);
    }

    @Override
    public void drive() {
        System.out.println(this.modelName + " saild the seas!");
    }
}
