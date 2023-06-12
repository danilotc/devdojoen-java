package edu.danilotc.javaoneforall.introduction.primitivetypes;

// Create variables for the fields described below between <> and print the following message:
// I <name>, living at <address>, confirm that I received the salary of <salary> on <date>
public class PrimitiveTypes02Exercice {
    public static void main(String[] args) {
        // input
        String name = "John";
        String address = "23 September Street";
        double salary = 5435.12D;
        String receivedSalaryDate = "12/06/2023"; // dd/MM/yyyy

        // build process
        String report = "I " + name + ", living at " + address + ", confirm that I received the salary of " + salary + " on " + receivedSalaryDate;

        // output
        System.out.println(report);
    }
}
