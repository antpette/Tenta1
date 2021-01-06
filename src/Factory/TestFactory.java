package Factory;

public class TestFactory {

    public static void main(String[] args){
        CarFactory volvo = new CarFactory();

        Car volvo240 = volvo.create();
        volvo240.drive();

        ShipFactory stena = new ShipFactory();

        Ship titanic = stena.create();

        titanic.drive();



    }
}
