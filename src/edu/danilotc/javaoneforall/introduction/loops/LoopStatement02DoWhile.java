package edu.danilotc.javaoneforall.introduction.loops;

public class LoopStatement02DoWhile {
    public static void main(String[] args) {
        int counter = 0;
        do {
            System.out.println("inside do-while " + (++counter));
        } while (counter < 10);
    }
}
