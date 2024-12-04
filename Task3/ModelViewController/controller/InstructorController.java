package controller;

import model.Course;
import model.Instructor;
import view.InstructorView;

public class InstructorController {

    private Instructor model;
    private InstructorView view;

    public InstructorController(Instructor model,InstructorView view){
        this.model=model;
        this.view=view;
    }

    //Create a new course
    public void createCourse(Course course) {
        model.createCourse(course);
    }

    //Delete an existing course
    public void deleteCourse(Course course) {
        model.deleteCourse(course);
    }

    //To change course attributes
    public void setManagedCourses() {
        model.setManagedCourses();
    }

    //Method for viewing Instructor's information
    public void updateView() {
        view.viewInstructorInformation();
    }
}
