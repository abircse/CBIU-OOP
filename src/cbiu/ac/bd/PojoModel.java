package cbiu.ac.bd;

public class PojoModel {

    // initialize variable
    private String studentname;
    private int studentage;
    private String studentgender;

    // creating a constructor
    PojoModel(String studentName, int studentAge, String studentGender) {
        this.studentname = studentName;
        this.studentage = studentAge;
        this.studentgender = studentGender;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }

    public String getStudentgender() {
        return studentgender;
    }

    public void setStudentgender(String studentgender) {
        this.studentgender = studentgender;
    }
}
