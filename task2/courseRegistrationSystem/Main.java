package courseRegistrationSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Initialize services
        NotificationService notificationService = new EmailNotificationService();
        Payment paymentService = new RocketPayment();
        CourseRegistrationSystem courseRegistrationSystem = new CourseRegistrationSystem(notificationService, paymentService);

        // Create students
        Student student1 = new Student("230201", "Student1", "student1@gamil.com",
                "Computer Science and Engineering", 2, 1);
        Student student2 = new Student("230202", "Student2", "student2@gmail.com",
                "Computer Science and Engineering", 2, 1);

        // Create courses
        Course apl = new Course("CSE 2100", "Advanced Programming laboratory", 1.5);
        Course ds = new Course("CSE 2101", "Data Structures", 3);

        // Instructor creates courses
        Instructor instructor = new Instructor("I001", "Instructor", "instructor@gmail.com");
        instructor.createCourse(apl);
        instructor.createCourse(ds);

        //add courses to register for each student
        student1.addCourse(apl);
        student1.addCourse(ds);
        student2.addCourse(apl);
        student2.addCourse(ds);

        List<Course> registeredCourses = student1.getRegisteredCourses();

        //Admin approve a student for registration
        Admin admin=new Admin("I002","Admin","admin@gmail.com");
        admin.approveStudent(student1,registeredCourses);

        // Register courses for a student
        courseRegistrationSystem.registerCourse(admin,student1,registeredCourses);

        // View registered courses
        System.out.println("Registered Courses for \n" + student1);
        for (Course course : registeredCourses) {
            System.out.println(course);
        }
        System.out.println("Approved by\n"+admin);

        // Find students in the same discipline, year, and semester
        List<Student> Students = CourseRegistrationSystem.getStudentsInSameDisciplineYearAndSemester(
                "Computer Science and Engineering", 2, 1);
        System.out.println("Students in Computer Science and Engineering Discipline, Year 2, Semester 1:");
        for (Student s : Students) {
            System.out.println(s);
        }
    }
}

