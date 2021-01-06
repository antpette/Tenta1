package Composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements IPlayer {

    String teamName;
    List<IPlayer> players = new ArrayList<>();

    public Team(String teamName){
        this.teamName = teamName;
    }

    @Override
    public void strongFoot() {
        System.out.println("I " + this.teamName + " spelar:");
        for(IPlayer player: players )
            player.strongFoot();

    }

    public void addPlayer(IPlayer player){
        players.add(player);
    }
}
