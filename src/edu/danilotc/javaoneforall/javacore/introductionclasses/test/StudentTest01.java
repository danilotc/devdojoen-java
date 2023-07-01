package edu.danilotc.javaoneforall.javacore.introductionclasses.test;

import edu.danilotc.javaoneforall.javacore.introductionclasses.domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        // Create object instantiation
        Student student = new Student();
        // Initialization of the atributes
        student.name = "Jhon";
        student.age = 42;
        student.gender = 'M';
        // Using the values of the atributes
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }
}
