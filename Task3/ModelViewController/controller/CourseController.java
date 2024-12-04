package controller;

import model.Course;
import view.CourseView;

public class CourseController {

    private Course model;
    private CourseView view;

    public CourseController(Course model,CourseView view){
        this.model=model;
        this.view=view;
    }

    //Get course code
    public String getCourseCode() {
        return model.getCourseCode();
    }

    //Get course name
    public String getCourseName() {
        return model.getCourseName();
    }

    //Get course credit
    public double getCredit() {
        return model.getCredit();
    }

    //Set course code
    public void setCourseCode() {
        model.setCourseCode();
    }

    //Set course name
    public void setCourseName() {
        model.setCourseName();
    }

    //Set course credit
    public void setCredit() {
        model.setCredit();
    }

    //Method to show course information
    public void updateView() {
        view.viewCourse();
    }
}
