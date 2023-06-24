package edu.danilotc.javaoneforall.introduction.arrays;

public class Array03 {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Matthew";
        names[1] = "Mark";
        names[2] = "Luke";
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
    }
}
