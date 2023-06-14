package edu.danilotc.javaoneforall.introduction.operators;

public class Example01Arithmetic {
    public static void main(String[] args) {
        // input
        int number01 = 10;
        int number02 = 20;

        // build process
        double result = number01 / (double) number02; // + - * / %
        int module = 27 % 5;

        // output
        System.out.println(result);
        System.out.println(module);
        // In case of certification beware of the operator +
        System.out.println(number01 + number02);
        System.out.println("Text" + number01 + number02);
        System.out.println(number01 + number02 + "Text" + number01 + number02);
    }
}
