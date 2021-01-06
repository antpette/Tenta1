package Observer;

public class TestObserver {
    public static void main(String[] args) {

        Store NetOnNet = new Store();
        InterestedCostumer Anton = new InterestedCostumer(NetOnNet);
        InterestedCostumer Fanny = new InterestedCostumer(NetOnNet);
        NetOnNet.newProduct();

    }
}
