package edu.danilotc.javaoneforall.javacore.Hinheritance.domain;

public class Employee {
    private String name;
    private String socialSecurityNumber;
    private Address address;
    private double salary;

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
