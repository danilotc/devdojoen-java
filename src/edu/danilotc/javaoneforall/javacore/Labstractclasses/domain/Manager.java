package edu.danilotc.javaoneforall.javacore.Labstractclasses.domain;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonusSalary() {
        salary = salary + salary * 0.05;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
