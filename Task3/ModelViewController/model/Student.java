package model;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Course> registeredCourses;
    private final double capacity = 25;
    private double credits;
    private String discipline;
    private int year;
    private int semester;
    private boolean hasCredit=false;

    // List to store all students
    private static List<Student> allStudents = new ArrayList<>();

    //add student to the list when a student object created
    public Student(String id, String name, String email, String discipline, int year, int semester) {
        super(id, name, email);
        this.registeredCourses = new ArrayList<>();
        this.discipline = discipline;
        this.year = year;
        this.semester = semester;
        credits=0.0;
        allStudents.add(this);
    }

    // get Discipline name
    public String getDiscipline() {
        return discipline;
    }

    // get Year
    public int getYear() {
        return year;
    }

    //get Semester
    public int getSemester() {
        return semester;
    }

    //get total registered Credits of a student
    public double getCredits() {
        return credits;
    }

    //get  registered Courses of a student
    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    //Set Discipline name
    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    //Set Year
    public void setYear(int year) {
        this.year = year;
    }

    //Set Semester
    public void setSemester(int semester) {
        this.semester = semester;
    }

    //set total Credits of a student
    public void setCredits() {

    }

    //set registered Courses of a student
    public void setRegisteredCourses() {

    }

    //Check if credits available and use it to add course
    public boolean hasAvailableCredits(Course course){
        //Implement logic for checking available courses
        //
        return hasCredit;
    }

    // Add course for a student
    public void addCourse(Course course){

    }

    public String toString() {
        return super.toString()+"\nDiscipline"+discipline+"\nYear"+year+"\nSemester"+semester;
    }
}
