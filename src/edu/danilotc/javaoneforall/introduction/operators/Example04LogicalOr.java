package edu.danilotc.javaoneforall.introduction.operators;

public class Example04LogicalOr {
    public static void main(String[] args) {
        // input
        double currentAccount = 299;
        double savingAccount = 3000;
        float playstationFivePrice = 500F;

        // build process
        boolean canBeBought = currentAccount > playstationFivePrice || savingAccount > playstationFivePrice;

        // output
        System.out.println("canBeBought " + canBeBought);
    }
}
