package courseRegistrationSystem;

import java.util.List;

public interface RegistrationSystem {
    void registerCourse(Student student, Course course);
    List<Course> viewRegisteredCourses();
}



