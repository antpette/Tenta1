package Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items;

    protected ShoppingCart(){
        this.items = new ArrayList<>();
    }

    protected void addItem(Item item){
        this.items.add(item);
    }

    protected void removeItem(Item item){
        this.items.remove(item);
    }

    protected int calculateTotal(){
        int sum =0;
        for(Item item: items)
            sum += item.getCost();
        return sum;
    }
    // ända kopplingen som finns mellan IPay och ShoppingCart
    protected void pay(IPay iPay){
        int amount = this.calculateTotal();
        iPay.pay(amount);
    }
}
