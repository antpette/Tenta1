package Decorator;

public class TestDecorator {

    public static void main(String[] args) {
        YourPizza AntonsPizza = new Salami(new Cheese(new BasePizza()));


        System.out.println("this is your " + AntonsPizza.createPizza());
    }
}
