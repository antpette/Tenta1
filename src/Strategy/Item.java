package Strategy;

public class Item {

    String name, number;
    int cost;

    Item(String name, String number,  int cost){
        this.name = name;
        this.number = number;
        this. cost = cost;
    }
    public String getName(){
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getCost() {
        return cost;
    }
}
