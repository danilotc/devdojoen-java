package edu.danilotc.javaoneforall.javacore.introductionmethods.test;

import edu.danilotc.javaoneforall.javacore.introductionmethods.domain.Student;
import edu.danilotc.javaoneforall.javacore.introductionmethods.domain.StudentPrinter;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        StudentPrinter printer = new StudentPrinter();

        student01.name = "Modoriya";
        student01.gender = 'M';
        student01.age = 15;

        student02.name = "Sakura";
        student02.gender = 'F';
        student02.age = 16;

        printer.print(student01);
        printer.print(student02);
    }
}
