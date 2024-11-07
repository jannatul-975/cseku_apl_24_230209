package courseRegistrationSystem;

public class Course {

    protected String courseCode;
    protected String courseName;
    protected double credit;

    public Course(String courseCode, String courseName, double credit) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit = credit;
    }

    public String getCourseId() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCredit() {
        return credit;
    }

    public boolean isRetake(Course course) {

    }

}
