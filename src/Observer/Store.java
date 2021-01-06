package Observer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<CostumerObserver> Costumer = new ArrayList<>();


    void addObserver(CostumerObserver observer) {
        Costumer.add(observer);
    }

    public void newProduct(){
        for( CostumerObserver CO : Costumer)
        CO.notifyCostumers();


    }
}
