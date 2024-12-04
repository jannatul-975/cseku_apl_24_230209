package model;

public class Course {

    private String courseCode;
    private String courseName;
    private double credit;

    public Course(String courseCode, String courseName, double credit) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit = credit;
    }

    //Get course code
    public String getCourseCode() {
        return courseCode;
    }

    //Get course name
    public String getCourseName() {
        return courseName;
    }

    //Get course credit
    public double getCredit() {
        return credit;
    }

    //Set course code
    public void setCourseCode() {

    }

    //Set course name
    public void setCourseName() {

    }

    //Set course credit
    public void setCredit() {

    }

    public String toString(){
        return "\nCourse Code:"+courseCode+"\nCourse Name"+courseName+"\nCredit"+credit;
    }

}
