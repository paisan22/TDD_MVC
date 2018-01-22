package nl.paisanrietbroek;

/**
 * Created by paisanrietbroek on 22/01/2018.
 */
public class StudentController {

    private Student student;
    private StudentView studentView;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
    }

    public void setStudentName(String name) {
        this.student.setName(name);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudentNumer(int number) {
        this.student.setNumber(number);
    }

    public String updateView() {
        return this.studentView.getInfo();
    }
}
