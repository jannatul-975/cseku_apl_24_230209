package ModelViewController;

public class Main {

    public static void main(String[] args) {
        // Create instances of Model and View
        Model model = new Model();
        View view = new View();

        // Create instance of Controller
        Controller controller = new Controller(model, view);

        // Initialize courses
        model.initializeCourses();

        // Example: Add students to the system
        Student student1 = new Student("John Doe", "12345");
        Student student2 = new Student("Jane Smith", "67890");

        controller.addStudentToSystem(student1);
        controller.addStudentToSystem(student2);

        // Register students for courses
        controller.registerStudentForCourses();

        // Post course registration information
        controller.postCourseRegistrationInfo();

        // Course approval process
        controller.courseApprovalProcess();

        // View registered courses for students
        controller.viewRegisteredCourses();

        // View students in the same discipline, year, and semester
        controller.viewStudentsInSameDisciplineYearAndSemester();

        // Close the scanner in the view to prevent resource leakage
        view.close();
    }
}
