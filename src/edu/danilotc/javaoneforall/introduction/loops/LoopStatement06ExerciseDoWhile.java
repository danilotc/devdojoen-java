package edu.danilotc.javaoneforall.introduction.loops;

public class LoopStatement06ExerciseDoWhile {
    public static void main(String[] args) {
        // Print all even numbers from 0 to 1_000_000
        int counter = 0;
        do {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            counter++;
        } while (counter <= 1000000);
    }
}
