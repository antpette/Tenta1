package Composite;

public class Player implements IPlayer{
    String name, strongFoot;
    int age;


    public Player(String name, int age, String strongFoot){
        this.name = name;
        this.age = age;
        this.strongFoot = strongFoot;
    }

    @Override
    public void strongFoot() {
        if(this.name.equals("Christiano Ronaldo"))
            System.out.println(this.name + " , " + this.strongFoot + "fotad SIIIIII!!!");
        else
        System.out.println(this.name + " , " + this.strongFoot + "fotad");
    }

}
