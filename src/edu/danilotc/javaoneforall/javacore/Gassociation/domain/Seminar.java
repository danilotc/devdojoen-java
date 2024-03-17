package edu.danilotc.javaoneforall.javacore.Gassociation.domain;

/*
    Create a small system that will manage seminars registration
    It should allow registering seminars, students, professors and the place where it will be

    Requeriments

    A student can have only one seminar
    A seminar can have zero or several students
    A professor can minister one or several seminars
    A seminar must have one place

    Basic Attributes
    seminar: title
    student: name, age
    professor: name, researchField
    place: address
*/

public class Seminar {
    private String title;
    private Student[] students;
    private Place place;

    public Seminar(String title, Place place) {
        this.title = title;
        this.place = place;
    }

    public Seminar(String title, Student[] students, Place place) {
        this.title = title;
        this.students = students;
        this.place = place;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
