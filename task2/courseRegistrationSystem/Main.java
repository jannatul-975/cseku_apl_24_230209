package courseRegistrationSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize services
        NotificationService notificationService = new EmailNotificationService();
        Payment paymentService = new RocketPayment();
        CourseRegistrationSystem courseRegistrationSystem = new CourseRegistrationSystem(notificationService, paymentService);

        // List to store students
        List<Student> students = new ArrayList<>();

        // Create some sample courses
        Course course1 = new Course("CSE101", "Advance Programming laboratory", 1.0);
        Course course2 = new Course("CSE102", "Data Structures", 3.0);
        Course course3 = new Course("CSE103", "Algorithms", 3.0);
        Course course4 = new Course("CSE104", "Operating Systems", 2.0);

        List<Course> courses = List.of(course1, course2, course3,course4);
        // Add students
        System.out.print("Enter the number of students to register : ");
        int studentCount = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= studentCount; i++) {
            System.out.print("Enter student ID: ");
            String id = scanner.next();

            System.out.print("Enter student name: ");
            String name = scanner.next();

            System.out.print("Enter student email: ");
            String email = scanner.next();

            System.out.print("Enter student discipline: ");
            String discipline = scanner.next();

            System.out.print("Enter student year: ");
            int year = scanner.nextInt();

            System.out.print("Enter student semester: ");
            int semester = scanner.nextInt();

            // Create a new student and add to the list
            Student student = new Student(id, name, email, discipline, year, semester);
            students.add(student);
        }

        // Display course registration options and register students for courses
        for (Student student : students) {
            System.out.println("Registering courses for " + student.getName() + ":");
            for (Course course : courses) {
                System.out.print("Do you want to register for " + course.getCourseName() + "? (yes/no): ");
                String registerChoice = scanner.next();
                if (registerChoice.equalsIgnoreCase("yes")) {
                    courseRegistrationSystem.registerCourse(student, course);
                    System.out.println("Registered " + student.getName() + " for " + course.getCourseName());
                }
            }
        }

        // Display each student's registered courses
        for (Student student : students) {
            System.out.println("Courses registered by " + student.getName() + ":");
            for (Course course : student.viewRegisteredCourses()) {
                System.out.println(" - " + course.getCourseName());
            }
        }

        // Display course registration options and register students for courses
        for (Student student : students) {
            System.out.println("Registering courses for " + student.getName() + ":");
            for (Course course : courses) {
                System.out.print("Do you want to register for " + course.getCourseName() + "? (yes/no): ");
                String registerChoice = scanner.next();
                if (registerChoice.equalsIgnoreCase("yes")) {
                    courseRegistrationSystem .registerCourse(student, course);
                    System.out.println("Registered " + student.getName() + " for " + course.getCourseName());
                }
            }
        }

        // Display students in the same discipline, year, and semester
        System.out.print("Enter a discipline to view students in the same year and semester: ");
        String discipline = scanner.next();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the semester: ");
        int semester = scanner.nextInt();

        List<Student> similarStudents = Student.getStudentsInSameDisciplineYearAndSemester(discipline, year, semester);
        if (!similarStudents.isEmpty()) {
            System.out.println("Students in " + discipline + " for year " + year + ", semester " + semester + ":");
            for (Student s : similarStudents) {
                System.out.println("- " + s.getName() + " (" + s.getEmail() + ")");
            }
        } else {
            System.out.println("No students found in the specified discipline, year, and semester.");
        }

        scanner.close();
    }
}

