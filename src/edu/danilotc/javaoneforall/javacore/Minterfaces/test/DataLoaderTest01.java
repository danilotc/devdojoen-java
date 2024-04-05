package edu.danilotc.javaoneforall.javacore.Minterfaces.test;

import edu.danilotc.javaoneforall.javacore.Minterfaces.domain.DatabaseLoader;
import edu.danilotc.javaoneforall.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        // loading data
        databaseLoader.load();
        fileLoader.load();

        // removing data
        databaseLoader.remove();
        fileLoader.remove();

        // checking permission from the interface or from the concrete class
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
