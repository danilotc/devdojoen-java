package edu.danilotc.javaoneforall.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Loading data from file");
    }
}
