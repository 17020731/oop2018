package week1;

public class StudentManagement {

    Student [] std = new Student[100];
    public boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }

    void studentsByGroup() {
        int [] check = new int [7];
        for(int i = 0; i < 7; i++)
            check[i] = 0;
        for(int i = 0; i < 7; i++){
            if(!check[i]){
                for(int j = i; j < 7; j++){
                    if(std[i].getGroup().equals(std[j].getGroup())){
                        std[j].getInfo();
                        check[i]=1;
                    }
                }
            }
        }
    }

    void removeStudent(String id) {
        for(int i = 0; i < 7; i++){
            if(std[i].getID().equals(id)){
                std[i].setName("");
                std[i].setID("");
                std[i].setEmail("");
                std[i].setGroup("");
                break;
            }
        }

    }

    public static void main(String[] args) {
        std[0].setName("Dinh The Hiep");
        std[0].setID("17020731");
        std[0].setEmail("17020731@vnu.edu.vn");
        std[0].setGroup("INT22041");
        std[0].getInfo();

        std[1] = new Student();
        std[1].getInfo();

        std[2] = new Student("Nguyen Van A", "17020836", "17020836@vnu.edu.vn");
        std[2].getInfo();

        Student studentT = new Student();
        studentT.setName("Nguyen Van B");
        studentT.setId("17020396");
        studentT.setGroup("INT22041");
        studentT.setEmail("17020396@cvp.vn");

        std[3] = new Student(studentT);
        std[3].getInfo();

        std[4] = new Student();
        std[4].setName("Nguyen Van C");
        std[4].setId("17020439");
        std[4].setGroup("INT22041");
        std[4].setEmail("17020439@vnu.edu.vn");

        std[5] = new Student();
        std[5].setName("Tran Van A");
        std[5].setId("17020398");
        std[5].setGroup("INT22042");
        std[5].setEmail("17020398@vnu.edu.vn");

        std[6] = new Student();
        std[6].setName("Le Thi A");
        std[6].setId("17024169");
        std[6].setGroup("INT22043");
        std[6].setEmail("17024169@vnu.edu.vn");

        if (sameGroup(std[4], std[5]) == true) {
            System.out.println("Hai sinh viên cùng lớp");
        } 
        else {
            System.out.println("Hai sinh viên khác lớp");
        }

        if (sameGroup(std[5], std[6]) == true) {
            System.out.println("Hai sinh viên cùng lớp");
        } 
        else{
            System.out.println("Hai sinh viên khác lớp");
        }
        System.out.println();

        studentsByGroup();
        removeStudent("17020731");

    }

}
