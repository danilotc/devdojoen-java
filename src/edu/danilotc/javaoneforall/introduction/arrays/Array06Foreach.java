package edu.danilotc.javaoneforall.introduction.arrays;

public class Array06Foreach {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 5};

        // For each number in integer numbers array, print number.
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
