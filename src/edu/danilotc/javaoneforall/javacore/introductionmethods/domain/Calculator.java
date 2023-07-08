package edu.danilotc.javaoneforall.javacore.introductionmethods.domain;

public class Calculator {
    public void sumTwoNumbers() {
        System.out.println(10 + 15);
    }

    public void subtractTwoNumbers() {
        System.out.println(25 - 3);
    }

    public void multiplyTwoNumbers(int number1, float number2) {
        System.out.println(number1 * number2);
    }

    public double divideTwoNumbers(double number1, double number2) {
        if (number2 == 0) {
            return 0;
        }
        return number1 / number2;
    }
}
