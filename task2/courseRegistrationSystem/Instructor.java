package courseRegistrationSystem;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person implements CourseManager {
    private List<Course> managedCourses;

    public Instructor(String id, String name, String email) {
        super(id, name, email);
        this.managedCourses = new ArrayList<>();
    }

    //Create a new course
    public void createCourse(Course course) {

    }

    //Delete an existing course
    public void deleteCourse(Course course) {

    }

    //To change course attributes
    public void setManagedCourses() {

    }

    //Get list of managed courses
    public List<Course> getManagedCourses() {
        //Implement logic for managing cources
        //
        return managedCourses;
    }

    public String toString() {
        return super.toString();
    }
}



