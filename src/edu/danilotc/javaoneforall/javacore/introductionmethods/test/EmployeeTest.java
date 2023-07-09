package edu.danilotc.javaoneforall.javacore.introductionmethods.test;

import edu.danilotc.javaoneforall.javacore.introductionmethods.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Sanji");
        employee.setAge(21);
        employee.setSalaries(new double[]{987.90, 2000, 1250.98}); //comment this to test
        employee.print();
    }
}
