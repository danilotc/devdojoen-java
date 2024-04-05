package edu.danilotc.javaoneforall.javacore.Minterfaces.domain;

public interface DataRemover {
    // the public and abstract keyworks is not necessary, it is redundant.
    public abstract void remove();

    // the public keyword is not necessary, it is redundant in the method marked as default.
    public default void checkPermission() {
        System.out.println("Checking permission general");
    }
}
