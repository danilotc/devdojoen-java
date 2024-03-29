package edu.danilotc.javaoneforall.javacore.Labstractclasses.test;

import edu.danilotc.javaoneforall.javacore.Labstractclasses.domain.Developer;
import edu.danilotc.javaoneforall.javacore.Labstractclasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Chaves", 5000);
        Developer developer = new Developer("Madruga", 12000);
        System.out.println(manager);
        System.out.println(developer);
        manager.print();
        developer.print();
    }
}
