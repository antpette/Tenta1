package Decorator;

public class Cheese extends ToppingAdder {

    public Cheese(YourPizza yourPizza) {
        super(yourPizza);
    }

    @Override
    public String createPizza(){
        return super.createPizza() + cheeseAdder();
    }

    private String cheeseAdder() {
        return " with cheese, ";
    }
}

