package edu.danilotc.javaoneforall.javacore.Bintroductionmethods.domain;

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

    public double divideTwoNumbers02(double number1, double number2) {
        if (number2 == 0) {
            return 0;
        } else {
            return number1 / number2;
        }
    }

    public double divideTwoNumbers03(double number1, double number2) {
        if (number2 != 0) {
            return number1 / number2;
        }
        return 0;
    }

    public void printTwoNumbersDivide(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Can't divide by 0");
            return;
        }
        System.out.println(number1 / number2);
    }

    public void changeTwoNumbers(int number1, int number2) {
        number1 = 99;
        number2 = 33;
        System.out.println("Inside changeTwoNumbers");
        System.out.println("Number1 = " + number1);
        System.out.println("Number2 = " + number2);
    }

    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    // It can has other parameters before
    public void sumVarArgs(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
