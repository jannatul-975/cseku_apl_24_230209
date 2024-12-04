package MVC_Main;

import controller.*;
import model.*;
import view.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create Courses
        Course apl = new Course("CSE2100", "Advance Programming Labratory", 1.5);
        Course ds = new Course("CSE2101", "Data Structures", 3.0);
        CourseView courseView = new CourseView();
        CourseController courseController = new CourseController(apl, courseView);

        // Create Students
        Student student = new Student("230201", "Student1", "student1@gmail.com",
                "Computer Science and Engineering", 2,1);
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student, studentView);

        // Instructor creates courses
        Instructor instructor = new Instructor("I001", "Instructor", "instructor@gmail.com");
        InstructorView instructorView=new InstructorView();
        InstructorController instructorController=new InstructorController(instructor,instructorView);
        instructorController.createCourse(apl);
        instructorController.createCourse(ds);

        //add courses to register for each student
        student.addCourse(apl);
        student.addCourse(ds);

        List<Course> courses = student.getRegisteredCourses();

        //Admin approve a student for registration
        Admin admin=new Admin("I002","Admin","admin@gmail.com");
        AdminView adminView = new AdminView();
        AdminController adminController = new AdminController(admin, adminView);
        adminController.approveStudent(student, courses);

        //Register courses for a student
        NotificationService notificationService = new EmailNotificationService();
        Payment payment = new RocketPayment();
        CourseRegistrationSystem courseRegistrationSystem = new CourseRegistrationSystem(notificationService, payment);
        CourseRegistrationSystemView courseRegistrationSystemView=new CourseRegistrationSystemView();
        CourseRegistrationSystemController courseRegistrationController=new CourseRegistrationSystemController(
                courseRegistrationSystem,courseRegistrationSystemView);
        courseRegistrationController.registerCourse(admin,student, courses);

        // Display views for verification
        adminController.updateView();
        studentController.updateView();
        courseController.updateView();
        instructorController.updateView();
        courseRegistrationController.updateView();
    }
}
