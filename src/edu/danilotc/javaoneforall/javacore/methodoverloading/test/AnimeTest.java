package edu.danilotc.javaoneforall.javacore.methodoverloading.test;

import edu.danilotc.javaoneforall.javacore.methodoverloading.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Finishing");
        anime.print();
    }
}
