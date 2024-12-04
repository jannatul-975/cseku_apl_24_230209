package controller;

import model.RocketPayment;
import model.Student;
import view.RocketPaymentView;

public class RocketPaymentController {

    private RocketPayment model;
    private RocketPaymentView view;

    public RocketPaymentController(RocketPayment model,RocketPaymentView view){
        this.model=model;
        this.view=view;
    }

    //Method to provide registration fees
    public void pay(Student student, double amount){
        model.pay(student,amount);
    }

    //Method to show payment message
    public void updateView() {
        view.viewPaymentMessage();
    }
}
