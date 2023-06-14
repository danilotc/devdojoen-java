package edu.danilotc.javaoneforall.introduction.operators;

public class Example03LogicalAnd {
    public static void main(String[] args) {
        // input
        int age = 35;
        float salary = 3500F;

        // build process
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4512;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3381;

        // output
        System.out.println("isLegalOlderThanThirty " + isLegalOlderThanThirty);
        System.out.println("isLegalYoungerThanThirty " + isLegalYoungerThanThirty);
    }
}
