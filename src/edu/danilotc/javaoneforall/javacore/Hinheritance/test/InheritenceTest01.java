package edu.danilotc.javaoneforall.javacore.Hinheritance.test;

import edu.danilotc.javaoneforall.javacore.Hinheritance.domain.Address;
import edu.danilotc.javaoneforall.javacore.Hinheritance.domain.Employee;
import edu.danilotc.javaoneforall.javacore.Hinheritance.domain.Manager;

public class InheritenceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("12h Ave");
        address.setZipcode("12345");

        Employee employee = new Employee("Toyohisa Shimazu");
        employee.setSocialSecurityNumber("121212");
        employee.setSalary(120000);
        employee.setAddress(address);
        employee.print();

        Manager manager = new Manager("Oda Nobunaga");
        manager.setSocialSecurityNumber("91212");
        manager.setSalary(250000);
        manager.setAddress(address);
        manager.setDepartment("IT");
        manager.print();
    }
}
