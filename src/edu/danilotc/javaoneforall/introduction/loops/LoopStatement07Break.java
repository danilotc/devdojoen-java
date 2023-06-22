package edu.danilotc.javaoneforall.introduction.loops;

public class LoopStatement07Break {
    public static void main(String[] args) {
        // Given a total number, for example 50, print the first 25
        int maxNumber = 50;
        for (int i = 0; i <= maxNumber; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("outside for");
    }
}
