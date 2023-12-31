package edu.danilotc.javaoneforall.javacore.Bintroductionmethods.domain;

public class Person {
    private String name;
    private int age;

    public void print() {
        System.out.println(getName());
        System.out.println(getAge());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }
}
