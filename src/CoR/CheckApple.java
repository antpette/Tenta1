package CoR;

public class CheckApple implements Chain{

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void resolve(Fruit fruit) {
        if(fruit instanceof Apple)
            System.out.println("Its an Apple! It has the color " + fruit.getColor());
        else
            nextChain.resolve(fruit);
    }
}
