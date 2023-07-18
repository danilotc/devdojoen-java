package edu.danilotc.javaoneforall.javacore.Bintroductionmethods.test;

import edu.danilotc.javaoneforall.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Results with different logic implementations
        double result = calculator.divideTwoNumbers(15, 2); // I prefer this one
        double result02 = calculator.divideTwoNumbers02(15, 4);
        double result03 = calculator.divideTwoNumbers03(15, 4);

        System.out.println(result);
        System.out.println(result02);
        System.out.println(result03);
        calculator.printTwoNumbersDivide(15, 0);
    }
}
