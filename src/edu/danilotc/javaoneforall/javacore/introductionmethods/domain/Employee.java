package edu.danilotc.javaoneforall.javacore.introductionmethods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salaries == null) {
            return;
        }
        for (double salary : salaries) {
            System.out.print(salary + " ");
        }
        calculateAndPrintAverageSalary();
    }

    public void calculateAndPrintAverageSalary() {
        if (salaries == null) {
            return;
        }
        double average = 0;
        for (double salary : salaries) {
            average += salary;
        }
        average /= salaries.length;
        System.out.println("\nThe average salary is " + average);
    }
}
