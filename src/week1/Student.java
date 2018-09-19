package week1;
public class Student {

    private String name, id, email, group;

    Student() {
        name = "Student";
        id = "000";
        group = "INT2204";
        email = "uet@vnu.edu.vn";
    }


    public Student(String n, String sid, String em) {
        this.name = n;
        this.id = sid;
        group = "INT22041";
        this.email = em;
    }


    public Student(Student s) {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void getInfo() {
        System.out.println("Student: " + name + "\nID: " + id + "\nGroup: " + group + "\nEmail: " + email + "\n");
    }
}

