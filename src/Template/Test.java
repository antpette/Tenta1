package Template;

public class Test {

    public static void main(String[] args){
        Car volvo = new Volvo240();
        Car saab = new Saab95();

        volvo.startEngine();
        saab.startEngine();
        volvo.gas(10);
        saab.gas(10);
        System.out.println(volvo.getCurrentSpeed());
        System.out.println(saab.getCurrentSpeed());
        volvo.turbo(10);
        System.out.println(volvo.getCurrentSpeed());
    }
}
