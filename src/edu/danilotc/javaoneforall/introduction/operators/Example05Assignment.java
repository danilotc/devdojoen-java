package edu.danilotc.javaoneforall.introduction.operators;

public class Example05Assignment {
    public static void main(String[] args) {
        double bonus = 1800;
        bonus += 1000; // bonus = bonus + 1000
        bonus -= 1000; // bonus = bonus - 1000
        bonus *= 2; // bonus = bonus * 2
        bonus /= 2; // bonus = bonus / 2
        bonus %= 2; // bonus = bonus % 2
        System.out.println(bonus);

        int count = 0;
        // after increment or decrement
        count++;
        count--;
        // before increment or decrement
        ++count;
        --count;
        System.out.println(count);
    }
}
