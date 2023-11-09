package managerstudent;

public class Teacher extends Information{
    private String teacherId;
    private int salary;
    private String mainSubject;

    public Teacher(String teacherId, int salary, String mainSubject) {
        this.teacherId = teacherId;
        this.salary = salary;
        this.mainSubject = mainSubject;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public void createInforSubject(){

    }

    public void updateInforSubject(){

    }

    public void createLecture(){

    }

    public void updateLecture(){

    }

    public void registerClassesOfTeacher(){

    }

    public void changeClassesOfTeacher(){

    }

    public void listScore(){

    }
}
