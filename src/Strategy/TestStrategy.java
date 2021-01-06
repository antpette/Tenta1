package Strategy;

public class TestStrategy {

    public static void main(String[] args){
        ShoppingCart my = new ShoppingCart();
        my.addItem(new Item("food", "1234", 100));
        my.addItem(new Item("game", "2233", 150));

        my.pay(new Klarna("anton", "1337"));
    }
}
