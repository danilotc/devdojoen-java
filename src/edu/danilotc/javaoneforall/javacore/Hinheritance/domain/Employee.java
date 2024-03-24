package edu.danilotc.javaoneforall.javacore.Hinheritance.domain;

public class Employee {
    protected String name;
    protected String socialSecurityNumber;
    protected Address address;
    protected double salary;

    static {
        System.out.println("Inside employee static init block");
    }

    {
        System.out.println("Inside employee init block 1");
    }

    {
        System.out.println("Inside employee init block 2");
    }

    public Employee(String name) {
        System.out.println("Inside employee constructor");
        this.setName(name);
    }

    public Employee(String name, String socialSecurityNumber) {
        this(name);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void print() {
        System.out.println(this.getName());
        System.out.println(this.getSocialSecurityNumber());
        System.out.println(this.getSalary());
        System.out.println(this.address.getStreet() + " " + this.getAddress().getZipcode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
