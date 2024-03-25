package edu.danilotc.javaoneforall.javacore.test;

import edu.danilotc.javaoneforall.javacore.Jfinalmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.SPEEDD_LIMIT);
        System.out.println(car.BUYER);
        car.BUYER.setName("Arnold");
        System.out.println(car.BUYER);
    }
}
