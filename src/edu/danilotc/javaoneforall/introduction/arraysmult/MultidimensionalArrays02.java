package edu.danilotc.javaoneforall.introduction.arraysmult;

public class MultidimensionalArrays02 {
    public static void main(String[] args) {
        // Initialization 1 using for-each as iterator (the array is not object)
        int[] array = {1, 2, 3};
        for (int number : array) {
            System.out.print(number);
        }
        System.out.println();

        // Initialization 2 using for-each as iterator (the array is not objetct)
        int[][] array2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};
        for (int[] baseArray : array2) {
            for (int number : baseArray) {
                System.out.print(number);
            }
            System.out.print(" ");
        }
        System.out.println();

        // Initialization 3 using for-each as iterator
        // The array is an object because use the keyword 'new'
        int[][] array3 = new int[3][];
        int[] numbers = {1, 2, 3};

        array3[0] = new int[]{1, 2};
        array3[1] = numbers;
        array3[2] = new int[]{1, 2, 3, 4, 5, 6};

        for (int[] baseArray : array3) {
            for (int num : baseArray) {
                System.out.print(num);
            }
            System.out.print(" ");
        }
    }
}
