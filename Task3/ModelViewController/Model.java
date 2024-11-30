package ModelViewController;

import java.util.ArrayList;
import java.util.List;

Class Student{
        //
        }

Class Course{
        //
        }
public class Model {

    private List<Student> students;
    private List<Course> courses;

    public Model() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        initializeCourses();
    }

    // Initialize sample courses
    public void initializeCourses() {

    }

    // Add student to the system
    public void addStudent(Student student) {
        students.add(student);
    }

    // Get all courses
    public List<Course> getCourses() {
        return courses;
    }
    public List<Course> getCourse() {

        return null;
    }

    // Get all students
    public List<Student> getStudents() {
        return students;
    }

    // Add course registration info to the system
    public void addCourseRegistrationInfo() {
        // Add logic to store registration info
    }

    // Register student for courses
    public void registerStudentForCourses() {
        // Add logic to register the student
    }

    // Process course approvals
    public void processCourseApprovals() {
        // Add logic for course approval processing
    }

    // Display registered courses
    public void RegisteredCourses() {
        // Add logic to display registered courses
    }

    // Display students based on discipline, year, and semester
    public void getStudentsInSameDisciplineYearAndSemester() {
        // Add logic to filter and retrieve students by discipline, year, and semester
    }
}
