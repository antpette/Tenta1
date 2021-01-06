package Strategy;

public class Klarna implements IPay {
    String name, password;

    public Klarna( String name, String password){
        this.name = name;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("You paid " + amount + " with Klarna");
    }
}
