package courseRegistrationSystem;

public class Person {
    protected String id;
    protected String name;
    protected String email;

    public Person(String id, String name, String email) {
        this.id=id;
        this.name = name;
        this.email = email;
    }

    //Get ID
    public String getId() {
        return id;
    }

    //Get name
    public String getName() {
        return name;
    }

    //Get email
    public String getEmail() {
        return email;
    }

    //Set ID
    public void setId(String id) {
        this.id = id;
    }

    //Set name
    public void setName(String name) {
        this.name = name;
    }

    //Set email
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "\nId:"+id+"\nName: "+name+"\nEmail"+email;
    }
}


