package edu.danilotc.javaoneforall.javacore.Jfinalmodifier.domain;

public class Buyer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Buyer{name=" + this.getName() + "}";
    }
}
