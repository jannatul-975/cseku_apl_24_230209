package controller;

import model.SMSNotificationService;
import model.Student;
import view.SMSNotificationServiceView;

public class SMSNotificationServiceController {

    private SMSNotificationService model;
    private SMSNotificationServiceView view;

    public SMSNotificationServiceController(SMSNotificationService model,
                                            SMSNotificationServiceView view){
        this.model=model;
        this.view=view;
    }

    //Method to send a sms to a student
    public void notify(Student student) {
        model.notify(student);
    }

    //Method to show sms notification message
    public void updateView() {
        view.viewNotification();
    }
}
