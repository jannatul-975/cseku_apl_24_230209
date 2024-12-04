package controller;

import model.EmailNotificationService;
import model.Student;
import view.EmailNotificationServiceView;

public class EmailNotificationServiceController {

    private EmailNotificationService model;
    private EmailNotificationServiceView view;

    public EmailNotificationServiceController(EmailNotificationService model,
                                              EmailNotificationServiceView view){
        this.model=model;
        this.view=view;
    }

    //Method to send email to a student
    public void notify(Student student) {
        model.notify(student);
    }

    //Method to show notification message
    public void updateView() {
        view.viewMessage();
    }
}
