package model;

import java.util.List;

public interface RegistrationSystem {

    //Method to check retake courses
    boolean isRetake(Student student, Course course);

    //Method to register  course
    void registerCourse(Admin admin, Student student, List<Course> course);

}



