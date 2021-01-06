package Decorator;

public class Salami extends ToppingAdder{

    public Salami(YourPizza yourPizza) {
        super(yourPizza);
    }

    @Override
    public String createPizza(){
        return super.createPizza() + salamiAdder();
    }

    private String salamiAdder() {
        return " with Salami, ";
    }
}
