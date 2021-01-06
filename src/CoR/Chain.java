package CoR;

public interface Chain {

    void setNextChain(Chain nextChain);

    void resolve(Fruit fruit);
}
