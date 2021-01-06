package Factory;

public class ShipFactory implements IVehicleFactory{
    @Override
    public Ship create() {
        return new Ship();
    }
}
