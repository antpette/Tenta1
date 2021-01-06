package Observer;

public class InterestedCostumer implements CostumerObserver{

    CostumerObserver observer;
    Store myStore;


    public InterestedCostumer(Store myStore) {
        myStore.addObserver(this);
    }

    @Override
    public void notifyCostumers() {
        System.out.println("waaay");
    }
}
