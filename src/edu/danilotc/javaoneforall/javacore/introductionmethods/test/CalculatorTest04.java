package edu.danilotc.javaoneforall.javacore.introductionmethods.test;

import edu.danilotc.javaoneforall.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int number1 = 10;
        int number2 = 12;
        calculator.changeTwoNumbers(number1, number2);

        System.out.println("Inside CalculatorTest04");
        System.out.println("Number1 = " + number1);
        System.out.println("Number2 = " + number2);
    }
}
