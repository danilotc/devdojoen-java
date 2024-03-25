package edu.danilotc.javaoneforall.javacore.Jfinalmodifier.domain;

public class Car {
    private String name;
    public static final double SPEEDD_LIMIT = 250;
    public final Buyer BUYER = new Buyer();

    public final void print() {
        System.out.println(this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
