package edu.danilotc.javaoneforall.javacore.Bintroductionmethods.test;

import edu.danilotc.javaoneforall.javacore.Bintroductionmethods.domain.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Jiraya");
        person.setAge(70);

        person.print();
    }
}
