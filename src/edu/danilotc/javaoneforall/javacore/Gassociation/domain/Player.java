package edu.danilotc.javaoneforall.javacore.Gassociation.domain;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
