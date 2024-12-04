package controller;

import model.Admin;
import model.Course;
import model.CourseRegistrationSystem;
import model.Student;
import view.CourseRegistrationSystemView;

import java.util.List;

public class CourseRegistrationSystemController {

    private CourseRegistrationSystem model;
    private CourseRegistrationSystemView view;

    public CourseRegistrationSystemController(CourseRegistrationSystem model,
                                              CourseRegistrationSystemView view){
        this.model=model;
        this.view=view;
    }

    //Method to know if a course is retake or not and use it to registerCourse method
    public boolean isRetake(Student student, Course course) {
        return model.isRetake(student,course);
    }

    //Method to register courses for a student
    public void registerCourse(Admin admin, Student student, List<Course> course) {
        model.registerCourse(admin,student,course);
    }

    //Method to show course registration details
    public void updateView() {
        view.displayRegistrationDetails();
    }
}
