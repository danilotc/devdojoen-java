package edu.danilotc.javaoneforall.javacore.Gassociation.test;

import edu.danilotc.javaoneforall.javacore.Gassociation.domain.Place;
import edu.danilotc.javaoneforall.javacore.Gassociation.domain.Professor;
import edu.danilotc.javaoneforall.javacore.Gassociation.domain.Seminar;
import edu.danilotc.javaoneforall.javacore.Gassociation.domain.Student;

public class ExerciseAssociationTest01 {
    public static void main(String[] args) {
        Place place = new Place("5th Av");
        Student student1 = new Student("Luffy", 17);
        Student student2 = new Student("Nami", 19);

        Student[] seminarStudents = {student1, student2};
        Seminar seminar = new Seminar("Finding one piece", seminarStudents, place);

        Seminar[] availableSeminars = {seminar};
        Professor professor = new Professor("White Beard", "Pirates", availableSeminars);

        professor.print();
    }
}
