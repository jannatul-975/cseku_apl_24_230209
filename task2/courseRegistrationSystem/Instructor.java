package courseRegistrationSystem;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person implements CourseManager {
    private List<Course> managedCourses;

    public Instructor(String id, String name, String email) {
        super(id, name, email);
        this.managedCourses = new ArrayList<>();
    }


    public void createCourse(Course course) {

    }


    public void deleteCourse(Course course) {

    }


    public List<Course> getManagedCourses() {

    }
}



