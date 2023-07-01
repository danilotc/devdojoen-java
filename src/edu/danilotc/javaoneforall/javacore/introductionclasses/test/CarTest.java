package edu.danilotc.javaoneforall.javacore.introductionclasses.test;

import edu.danilotc.javaoneforall.javacore.introductionclasses.domain.Car;

/*
Create a class Car with the following attributes: Name, Model, Year.
Then, create two distincts objects and print their value.
 */
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Ferrari";
        car1.model = "Enzo";
        car1.year = 2007;

        car2.name = "Mustang";
        car2.model = "GT 500";
        car2.year = 1968;

        // This changes the object reference
        car1 = car2;

        System.out.println("Car 1");
        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);

        System.out.println("\nCar 2");
        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);
    }
}
