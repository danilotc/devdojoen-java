package edu.danilotc.javaoneforall.introduction.loops;

public class LoopStatement08ExerciseBreak {
    public static void main(String[] args) {
        // Given a car's total prince, for example 20_000
        // I want to find how much for how long I'll have to pay monthly
        // Condition: The monthly payment cannot be lower than 1000
        double totalPrice = 20000;
        for (int monthCount = 1; monthCount <= totalPrice; monthCount++)
        {
            double monthlyPrice = totalPrice / monthCount;
            if (monthlyPrice < 1000) {
                break;
            }
            System.out.println("Months " + monthCount + " price " + monthlyPrice);
        }
    }
}
