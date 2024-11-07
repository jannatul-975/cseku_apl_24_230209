package courseRegistrationSystem;

public class Admin extends Person implements Approval {

    public Admin(String id, String name, String email) {
        super(id, name, email);
    }


    public void approveRegistration(Student student, Course course) {

    }
}

