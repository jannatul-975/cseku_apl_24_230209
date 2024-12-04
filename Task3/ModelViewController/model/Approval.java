package model;

import java.util.List;

public interface Approval {

    //Method to approve a student
    void approveStudent(Student student, List<Course> course);

    //Method to check if a student is approved or not
    boolean isApproved(Student student);

}

