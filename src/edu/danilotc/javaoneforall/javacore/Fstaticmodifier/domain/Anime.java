package edu.danilotc.javaoneforall.javacore.Fstaticmodifier.domain;

public class Anime {
    private String name;
    private static int[] episodes;

    // 0 - Static initialization block executed when JVM loads the class and only once
    // 1 - Memory allocated
    // 2 - Each class attribute is initialized
    // 3 - Init block is executed
    // 4 - The constructor is executed
    static {
        System.out.println("Inside init block 1");
        episodes = new int[15];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Inside init block 2");
    }

    static {
        System.out.println("Inside init block 3");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public static int[] getEpisodes() {
        return episodes;
    }
}
