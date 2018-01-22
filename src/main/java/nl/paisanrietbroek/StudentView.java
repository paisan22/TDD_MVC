package nl.paisanrietbroek;

/**
 * Created by paisanrietbroek on 22/01/2018.
 */
public class StudentView {

    private Student student;

    public StudentView(Student student) {
        this.student = student;
    }

    public String getInfo() {
        return "Name: " + student.getName() + " || Number: " + student.getNumber();
    }
}
