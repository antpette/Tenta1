package CoR;

public class TestCoR {
    public static void main(String[] args) {

        Fruit apple = new Orange();

        fruitChain(apple);

    }

    public static void fruitChain(Fruit fruit){
        Chain chain1 = new CheckApple();
        Chain chain2 = new CheckOrange();

        chain1.setNextChain(chain2);

        chain1.resolve(fruit);
    }
}
