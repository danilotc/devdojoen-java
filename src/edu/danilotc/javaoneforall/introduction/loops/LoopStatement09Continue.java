package edu.danilotc.javaoneforall.introduction.loops;

public class LoopStatement09Continue {
    public static void main(String[] args) {
        double totalPrice = 20000;
        for (int monthCount = (int) totalPrice; monthCount >= 1; monthCount--)
        {
            double monthlyPrice = totalPrice / monthCount;
            if (monthlyPrice < 1000) {
                continue;
            }
            System.out.println("Months " + monthCount + " price " + monthlyPrice);
        }
    }
}
