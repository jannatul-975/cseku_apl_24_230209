package courseRegistrationSystem;

import java.util.List;

public class CourseRegistrationSystem implements RegistrationSystem {

    private NotificationService notificationService;
    private Payment payment;
    private boolean isRetake=false;

    //Method for send notification and complete payment process and use it for registerCourse
    public CourseRegistrationSystem(NotificationService notificationService, Payment payment) {
        this.notificationService=notificationService;
        this.payment=payment;
    }

    //Method to know if a course is retake or not and use it to registerCourse method
    public boolean isRetake(Student student,Course course) {
        //Implement logic for if a course is retake or not
        //
        return isRetake;
    }

    //Method to register courses for a student
    public void registerCourse(Admin admin, Student student, List<Course> course) {
        if(admin.isApproved(student)){
            //continue registration process
        }
        else{
            System.out.println("Admin not approved this student.");
        }
    }

    // Method to retrieve all students in the same discipline, year, and semester
    public static List<Student> getStudentsInSameDisciplineYearAndSemester(String discipline, int year, int semester) {
        List<Student> desiredStudentList = null;
        //Implement logic for filtering same Discipline, year and semester student
        //
        return desiredStudentList;
    }

}


