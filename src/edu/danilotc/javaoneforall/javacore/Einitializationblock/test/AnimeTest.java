package edu.danilotc.javaoneforall.javacore.Einitializationblock.test;

import edu.danilotc.javaoneforall.javacore.Einitializationblock.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("One Peace");
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }
    }
}
