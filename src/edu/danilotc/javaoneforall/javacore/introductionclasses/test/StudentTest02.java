package edu.danilotc.javaoneforall.javacore.introductionclasses.test;

import edu.danilotc.javaoneforall.javacore.introductionclasses.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Sanji";

        System.out.println(student1.name);
        System.out.println(student2.name); // Default value
    }
}
