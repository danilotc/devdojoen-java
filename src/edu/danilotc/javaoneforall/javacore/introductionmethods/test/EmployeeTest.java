package edu.danilotc.javaoneforall.javacore.introductionmethods.test;

import edu.danilotc.javaoneforall.javacore.introductionmethods.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Sanji";
        employee.age = 21;
        employee.salaries = new double[]{987.90, 2000, 1250.98}; //comment this to test
        employee.print();
    }
}
