package model;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Person implements Approval {

    private List<Student> approvedStudents = new ArrayList<>();

    public Admin(String id, String name, String email) {
        super(id, name, email);
    }

    //Method to approve a student
    public void approveStudent(Student student, List<Course> course) {

    }

    //Method to check if a student is approved or not
    public boolean isApproved(Student student) {
        return approvedStudents.contains(student);
    }

    public String toString() {
        return super.toString();
    }
}

