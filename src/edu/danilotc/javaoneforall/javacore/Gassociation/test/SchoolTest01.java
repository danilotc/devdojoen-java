package edu.danilotc.javaoneforall.javacore.Gassociation.test;

import edu.danilotc.javaoneforall.javacore.Gassociation.domain.Professor;
import edu.danilotc.javaoneforall.javacore.Gassociation.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Luffy");
        
        Professor[] professors = {professor1, professor2};
        School school = new School("Cambridge", professors);

        school.print();
    }
}
