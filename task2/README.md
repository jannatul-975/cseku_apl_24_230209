#**Project on Course Registration System**
###Here we implement a course registration system with applying SOLID principles
#**Project Structure**
##courseRegistrationSystem
11.Admin
2.Approval
3.Course
4.CourseManager
5.CourseRegistrationSystem
6.EmailNotificationService
7.Instructor
8.NotificationService
9.Payment
10.Person
11.RegistrationSystem
12.RocketPayment
13.SMSNotificationService
14.Student
   Main
#**How it implement SOLID principles**
###**Single Responsibility Principle (SRP)**
Student,Admin,Course,Instructor have one responsibility or have only one reason to change.
###**Open-Closed Principle (OCP)**
NotificationService and Payment service can be extended without modifying the existing code.
###**Liskov Substitution Principle (LSP)**
Sub Class can be used as parent class that dosen't differ from original code.Admin,Student,Instructor class can be used instead of Person
class that dosen't alter the functionality of Person class. Also EmailNotificationService,SMSNotificationService can be used as 
NotificationService class.Whereas RocketPayment class can also be used instead of it's parent class Payment.
###**Interface Segregation Principle (ISP)**
Approval,CourseManager,NotificationService,Payment,RegistrationSystem obey ISP and extend code's reuseability,maintainability and avoid 
implementation of unused methods.
###**Dependency Inversion Principle (DIP)**
CourseRegistrationSystem dose not directly depend on NotificationService and Payment Interface that ensures the code being more flexible.
At any time we can change NotificationService or Payment service without altering CourseRegistrationSystem logic.
###The use of SOLID principles make system more efficient and flexible.
