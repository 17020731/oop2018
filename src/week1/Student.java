
public class Student {

    private name, id, email, group;

    Student() {
        name = "Student";
        id = "000";
        group = "INT2204";
        email = "uet@vnu.edu.vn";
    }

    
    Student(String n, String sid, String em) {
        name = _n;
        id = sid;
        group = "INT22041";
        email = em;
    }

    
    Student(Student s) {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(String sid) {
        id = sid;
    }

    public String getId() {
        return id;
    }

    public void setGroup(String _group) {
        group = _group;
    }

    public String getGroup() {
        return group;
    }

    public void setEmail(String em) {
        email = em;
    }

    public String getEmail() {
        return email;
    }

    public void getInfo() {
        System.out.println("Student: " + name+ "\nID: " + id+ "\nGroup: " + group + "\nEmail: " + email + "\n");
    }
}
