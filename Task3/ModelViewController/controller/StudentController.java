package controller;

import model.Course;
import model.Student;
import view.StudentView;

import java.util.List;

public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model,StudentView view){
        this.model=model;
        this.view=view;
    }

    // get Discipline name
    public String getDiscipline() {
        return model.getDiscipline();
    }

    // get Year
    public int getYear() {
        return model.getYear();
    }

    //get Semester
    public int getSemester() {
        return model.getSemester();
    }

    //get total registered Credits of a student
    public double getCredits() {
        return model.getCredits();
    }

    //get  registered Courses of a student
    public List<Course> getRegisteredCourses() {
        return model.getRegisteredCourses();
    }

    //Set Discipline name
    public void setDiscipline(String discipline) {
        model.setDiscipline(discipline);
    }

    //Set Year
    public void setYear(int year) {
        model.setYear(year);
    }

    //Set Semester
    public void setSemester(int semester) {
        model.setSemester(semester);
    }

    //set total Credits of a student
    public void setCredits() {
        model.setCredits();
    }

    //set registered Courses of a student
    public void setRegisteredCourses() {
        model.setRegisteredCourses();
    }

    //Check if credits available and use it to add course
    boolean hasAvailableCredits(Course course){
        return model.hasAvailableCredits(course);
    }

    // Add course for a student
    public void addCourse(Course course){
        model.addCourse(course);
    }

    //Method to show student's information
    public void updateView() {
        view.viewStudentInformation();
    }
}
