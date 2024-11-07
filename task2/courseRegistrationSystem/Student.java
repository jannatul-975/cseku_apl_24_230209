package courseRegistrationSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student extends Person implements RegistrationSystem {
    private List<Course> registeredCourses;
    private final double capacity = 25;
    private String discipline;
    private int year;
    private int semester;

    // List to store all students
    private static List<Student> allStudents = new ArrayList<>();

    public Student(String id, String name, String email, String discipline, int year, int semester) {
        super(id, name, email);
        this.registeredCourses = new ArrayList<>();
        this.discipline = discipline;
        this.year = year;
        this.semester = semester;
        allStudents.add(this);
    }

    // Getter and setter methods for discipline, year, and semester
    public String getDiscipline() {
        return discipline;
    }

    public int getYear() {
        return year;
    }

    public int getSemester() {
        return semester;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    // Method to register a course
    public void registerCourse(Student student, Course course) {
        if (student.hasAvailableCredits() && !registeredCourses.contains(course)) {
            registeredCourses.add(course);
        }
    }

    // Method to view registered courses
    public List<Course> viewRegisteredCourses() {
        return registeredCourses;
    }

    // Check if student has available credits
    public boolean hasAvailableCredits() {

    }

    // Method to retrieve all students in the same discipline, year, and semester
    public static List<Student> getStudentsInSameDisciplineYearAndSemester(String discipline, int year, int semester) {

    }
}
