package week1;


public class StudentManagement {

    static Student[] std = new Student[100];

    public static boolean sameGroup(Student s1, Student s2) {       //Phương thức so sánh có cùng lớp không?
        if (s1.getGroup() == null || s2.getGroup() == null)
            return false;
        return (s1.getGroup().equals(s2.getGroup()));
    }

    static void studentsByGroup() {                                 //Phương thức in ra danh sách theo nhóm lớp
        System.out.println("Danh sách sinh viên theo lớp: ");
        boolean[] check = new boolean[7];
        for (int i = 0; i < 7; i++) {
            check[i] = false;
        }
        for (int i = 0; i < 7; i++) {
            if (!check[i]) {
                System.out.println("Group: " + std[i].getGroup());
                System.out.println(std[i].getName());
                for (int j = i + 1; j < 7; j++) {
                    if (sameGroup(std[i], std[j])) {
                        System.out.println(std[j].getName());
                        check[j] = true;
                    }
                }
                System.out.println("\n---------------------------------\n");
            }
        }
    }

    static void removeStudent(String id) {                      // Phương thức xóa sinh viên với ID truyền vâo
        for (int i = 0; i < 7; i++) {
            if (std[i].getId() == id) {
                for(int j = i+1; j < 7;j++) {
                    std[j - 1] = std[j];
                }
            }
        }
        System.out.println("Danh sách sinh viên sau khi xóa: ");
        for(int i = 0; i < 6; i++){
            System.out.println(i+1+". " + (std[i]).getName());
        }


    }

    public static void main(String[] args) {
        std[0] = new Student();                 //Sinh viên 1: Dinh The Hiep
        std[0].setName("Dinh The Hiep");
        std[0].setId("17020731");
        std[0].setEmail("17020731@vnu.edu.vn");
        std[0].setGroup("INT22041");
        std[0].getInfo();

        std[1] = new Student();                 //Sinh viên 2: mặc định
        std[1].getInfo();

        std[2] = new Student("Nguyen Van A", "17020836", "17020836@vnu.edu.vn");             // Sinh viên 3 : Nguyen Van A
        std[2].getInfo();

        Student studentT = new Student();
        studentT.setName("Nguyen Van B");
        studentT.setId("17020396");
        studentT.setGroup("INT22042");
        studentT.setEmail("17020396@vnu.edu.vn");

        std[3] = new Student(studentT);         // Sinh viên 4 : Nguyen Van B
        std[3].getInfo();

        std[4] = new Student();                 //Sinh viên 5  : Nguyen Van C
        std[4].setName("Nguyen Van C");
        std[4].setId("17020439");
        std[4].setGroup("INT22041");
        std[4].setEmail("17020439@vnu.edu.vn");

        std[5] = new Student();                 //Sinh viên 6 : Tran Van A
        std[5].setName("Tran Van A");
        std[5].setId("17020398");
        std[5].setGroup("INT22042");
        std[5].setEmail("17020398@vnu.edu.vn");

        std[6] = new Student();                 //Sinh viên 7 : Le Thi A
        std[6].setName("Le Thi A");
        std[6].setId("17024169");
        std[6].setGroup("INT22043");
        std[6].setEmail("17024169@vnu.edu.vn");

        if (sameGroup(std[4], std[5]) == true) {
            System.out.println("Hai sinh viên cùng lớp");
        } else {
            System.out.println("Hai sinh viên khác lớp");
        }

        if (sameGroup(std[5], std[6]) == true) {
            System.out.println("Hai sinh viên cùng lớp");
        } else {
            System.out.println("Hai sinh viên khác lớp");
        }
        System.out.println();

        studentsByGroup();          //in danh sách theo lớp

        removeStudent("17020731");      // xóa thông tin sinh viên 1 : Dinh The Hiep


    }

}
