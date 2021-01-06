package CoR;

public class CheckOrange implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void resolve(Fruit fruit) {
        if(fruit instanceof Orange)
            System.out.println("Its an Orange! It has the color " + fruit.getColor());
        else
            nextChain.resolve(fruit);
    }
}
