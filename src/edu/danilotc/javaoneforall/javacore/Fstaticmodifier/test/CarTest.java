package edu.danilotc.javaoneforall.javacore.Fstaticmodifier.test;

import edu.danilotc.javaoneforall.javacore.Fstaticmodifier.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        System.out.println(Car.getSpeedLimit());

        Car car1 = new Car("BMW", 270);
        Car car2 = new Car("Mercedes", 285);
        Car car3 = new Car("Audi", 290);

        car1.print();
        car1.setSpeedLimit(180);
        car1.print();
        car2.print();
        car3.print();
    }
}
