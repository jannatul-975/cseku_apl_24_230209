#**Project on Course Registration System**#<br/>
###Here we implement a course registration system with applying SOLID principles###<br/>
#**Project Structure**<br/>
##courseRegistrationSystem<br/>
11.Admin<br/>
2.Approval<br/>
3.Course<br/>
4.CourseManager<br/>
5.CourseRegistrationSystem<br/>
6.EmailNotificationService<br/>
7.Instructor<br/>
8.NotificationService<br/>
9.Payment<br/>
10.Person<br/>
11.RegistrationSystem<br/>
12.RocketPayment<br/>
13.SMSNotificationService<br/>
14.Student<br/>
   Main<br/>
#**How it implement SOLID principles**<br/>
###**Single Responsibility Principle (SRP)**<br/>
Student,Admin,Course,Instructor have one responsibility or have only one reason to change.<br/>
###**Open-Closed Principle (OCP)**<br/>
NotificationService and Payment service can be extended without modifying the existing code.<br/>
###**Liskov Substitution Principle (LSP)**<br/>
Sub Class can be used as parent class that dosen't differ from original code.Admin,Student,Instructor class can be used instead of Person<br/>
class that dosen't alter the functionality of Person class. Also EmailNotificationService,SMSNotificationService can be used as<br/>
NotificationService class.Whereas RocketPayment class can also be used instead of it's parent class Payment.<br/>
###**Interface Segregation Principle (ISP)**<br/>
Approval,CourseManager,NotificationService,Payment,RegistrationSystem obey ISP and extend code's reuseability,maintainability and avoid<br/> 
implementation of unused methods.<br/>
###**Dependency Inversion Principle (DIP)**<br/>
CourseRegistrationSystem dose not directly depend on NotificationService and Payment Interface that ensures the code being more flexible.<br/>
At any time we can change NotificationService or Payment service without altering CourseRegistrationSystem logic.<br/>
###The use of SOLID principles make system more efficient and flexible.<br/>
