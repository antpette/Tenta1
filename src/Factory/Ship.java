package Factory;

public class Ship implements IVehicle {

    @Override
    public void drive() {
        System.out.println("The ship drove on water!");
    }
}
