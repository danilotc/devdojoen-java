package edu.danilotc.javaoneforall.javacore.constructors.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String status;

    // Empty constructor or default constructor
    public Anime() {
    }

    // Overloading constructor
    public Anime(String name, String type, int episodes, String status) {
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.status = status;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.status);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
