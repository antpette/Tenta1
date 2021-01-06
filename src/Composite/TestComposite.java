package Composite;

public class TestComposite {

    public static void main(String[] args){
        Team Lindome = new Team("Lindome");
        Team LindomeB = new Team("LindomeB");
        Lindome.addPlayer(new Player("Anton", 22, "höger"));
        Lindome.addPlayer(new Player("Axel", 22, "vänster"));
        LindomeB.addPlayer(new Player("Albert", 35, "höger"));
        Lindome.addPlayer(new Player("Christiano Ronaldo", 35, "höger"));
        LindomeB.addPlayer(new Player("Gunnar", 55, "vänster"));
        Lindome.addPlayer(LindomeB);
        Lindome.strongFoot();
    }
}
