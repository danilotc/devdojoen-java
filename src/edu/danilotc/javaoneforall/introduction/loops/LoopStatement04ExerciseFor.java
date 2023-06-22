package edu.danilotc.javaoneforall.introduction.loops;

public class LoopStatement04ExerciseFor {
    public static void main(String[] args) {
        // Print all even numbers from 0 to 1_000_000
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
