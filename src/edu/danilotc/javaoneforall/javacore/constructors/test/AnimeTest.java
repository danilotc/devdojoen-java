package edu.danilotc.javaoneforall.javacore.constructors.test;

import edu.danilotc.javaoneforall.javacore.constructors.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Finishing", "Production IG");
        anime.print();
    }
}
