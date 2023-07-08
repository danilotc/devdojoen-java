package edu.danilotc.javaoneforall.javacore.introductionmethods.test;

import edu.danilotc.javaoneforall.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest05
{
    // I chenged String[] to String... in this parameter of main method
    public static void main(String... args)
    {
        Calculator calculator = new Calculator();
        int[] numbers = {1, 2, 3, 4, 5};

        // Using array as parameter
        calculator.sumArray(numbers);

        // Using varargs as parameter
        calculator.sumVarArgs(1, 2, 3, 4, 5, 6, 7); // that is the facility
        calculator.sumVarArgs(numbers); // accept an array too
    }
}
