package managerstudent;

public class Student extends Information{
    private String studentId;
    private String classes;
    private TypeOfTraining type;
    private String fee;

    public Student(String studentId, String classes, TypeOfTraining type, String fee) {
        this.studentId = studentId;
        this.classes = classes;
        this.type = type;
        this.fee = fee;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public TypeOfTraining getType() {
        return type;
    }

    public void setType(TypeOfTraining type) {
        this.type = type;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public void register(){

    }

    public void changeClass(){

    }

    public void payTheSchoolFee(){

    }

    public void updatePrivateInfor(){

    }

    public void goToSchool(){

    }

    public void doHomeWork(){

    }
}
