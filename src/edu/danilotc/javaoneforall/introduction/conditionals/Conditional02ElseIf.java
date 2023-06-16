package edu.danilotc.javaoneforall.introduction.conditionals;

public class Conditional02ElseIf {
    public static void main(String[] args) {
        // age < 15 Category Junior
        // age >= 15 && age < 18 Category Senior
        // age >= 18 Category Master
        int age = 17;
        String category;

        if(age < 15) {
            category = "Category Junior";
        } else if (age >= 15 && age < 18) {
            category = "Category Senior";
        } else {
            category = "Category Master";
        }

        // Don't use ternary operator if you have two or more conditionals, It's not a good practice.
        category = age < 15 ? "Category Junior" : age >= 15 && age < 18? "Category Senior" : "Category Master";

        System.out.println(category);
    }
}
