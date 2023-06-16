package edu.danilotc.javaoneforall.introduction.conditionals;

public class Conditional03TernaryOperator {
    public static void main(String[] args) {
        // if salary > 2000 then "buy ps5", else "don't buy ps5"
        double salary = 3500D;
        String shouldBuyMessage = "buy PS5";
        String shouldNotBuyMessage = "don't buy PS5";

        // (condition) ? <true> : <false>
        String displayMessage = salary > 2000 ? shouldBuyMessage : shouldNotBuyMessage;

        System.out.println(displayMessage);
    }
}
