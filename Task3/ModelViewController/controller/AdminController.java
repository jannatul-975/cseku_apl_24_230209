package controller;

import model.Admin;
import model.Course;
import model.Student;
import view.AdminView;

import java.util.List;

public class AdminController {

    private Admin model;
    private AdminView view;

    public AdminController(Admin model,AdminView view){
        this.model=model;
        this.view=view;
    }

    //Method to approve a student
    public void approveStudent(Student student, List<Course> course) {
        model.approveStudent(student,course);
    }

    //Method to check if a student is approved or not
    public boolean isApproved(Student student) {
        return model.isApproved(student);
    }

    //Method to show Admin's information
    public void updateView() {
        view.viewAdminInformation();
    }
}
