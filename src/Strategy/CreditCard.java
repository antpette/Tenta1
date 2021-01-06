package Strategy;

public class CreditCard implements IPay {
    String name, number, safeNumber;

    CreditCard(String name, String number, String safeNumber){
        this.name = name;
        this.number = number;
        this.safeNumber = safeNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("You paid amount " + amount + " with creditcard");
    }
}
