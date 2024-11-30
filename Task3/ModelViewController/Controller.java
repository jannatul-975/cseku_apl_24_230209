package ModelViewController;

public class Controller {
    Model model;
    View view;

    // Constructor to initialize the view and model
    public Controller(Model model, View view) {
        this.view = view;
        this.model = model;
    }

    // Post course registration information
    public void postCourseRegistrationInfo() {
        model.addCourseRegistrationInfo();  // Add course registration details to the model
        view.displayCourseRegistrationInfo();  // Display course registration info on the view
    }

    // Register a student for courses
    public void registerStudentForCourses() {
        view.displayCourses(model.getCourses());  // Display available courses
        model.registerStudentForCourses();  // Register student for selected courses
    }

    // Host the course approval process (like approvals for course registration)
    public void courseApprovalProcess() {
        view.displayApprovalRequests();  // Show course approval requests
        model.processCourseApprovals();  // Process course approvals
        view.notifyApprovalResults();  // Notify students about approval results
    }

    // Display the list of courses registered by students
    public void viewRegisteredCourses() {
        model.RegisteredCourses();  // registered courses from the model
        view.showRegisteredCourses();  // Display the registered courses
    }

    // View students in the same discipline, year, and semester
    public void viewStudentsInSameDisciplineYearAndSemester() {
        view.askForDisciplineYearSemester();  // Prompt for discipline, year, and semester
        model.getStudentsInSameDisciplineYearAndSemester();  // students based on discipline, year, and semester
        view.displayStudentsInSameDiscipline();  // Display students in the same discipline, year, and semester
    }

    // Add a student to the system
    public void addStudentToSystem(Student student) {
        model.addStudent(student);
        }
    }



