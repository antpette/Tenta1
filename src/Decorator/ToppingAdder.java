package Decorator;

public class ToppingAdder implements YourPizza {

    private YourPizza yourPizza;

    public ToppingAdder(YourPizza yourPizza){
        this.yourPizza = yourPizza;
    }

    @Override
    public String createPizza() {
        return yourPizza.createPizza();
    }
}
