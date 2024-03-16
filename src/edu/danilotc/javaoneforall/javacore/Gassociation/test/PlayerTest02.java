package edu.danilotc.javaoneforall.javacore.Gassociation.test;

import edu.danilotc.javaoneforall.javacore.Gassociation.domain.Player;
import edu.danilotc.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player = new Player("Pelé");

        Team team = new Team("Brazil's national team");

        player.setTeam(team);

        player.print();
    }
}
