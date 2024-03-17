package edu.danilotc.javaoneforall.javacore.Gassociation.test;

import edu.danilotc.javaoneforall.javacore.Gassociation.domain.Player;
import edu.danilotc.javaoneforall.javacore.Gassociation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Cafu");
        Team team = new Team("Brazil");

        Player[] players = {player1, player2};

        player1.setTeam(team);
        player2.setTeam(team);
        team.setPlayers(players);

        System.out.println("--- Player ---");
        player1.print();
        System.out.println("--- Team ---");
        team.print();
    }
}
