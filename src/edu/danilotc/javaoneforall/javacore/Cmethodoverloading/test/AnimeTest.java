package edu.danilotc.javaoneforall.javacore.Cmethodoverloading.test;

import edu.danilotc.javaoneforall.javacore.Cmethodoverloading.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Finishing");
        anime.print();
    }
}
