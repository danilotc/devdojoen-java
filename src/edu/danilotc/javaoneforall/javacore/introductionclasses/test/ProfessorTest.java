package edu.danilotc.javaoneforall.javacore.introductionclasses.test;

import edu.danilotc.javaoneforall.javacore.introductionclasses.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        // Create object instantiation
        Professor professor = new Professor();
        // Initialilzation of atributes
        professor.name = "Melvin Thompson";
        professor.age = 42;
        professor.gender = 'M';
        // Using the values of the atributes
        System.out.println("Name: " + professor.name +" Age: "+ professor.age +" Gender: "+ professor.gender);
    }
}
