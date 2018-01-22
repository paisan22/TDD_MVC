package nl.paisanrietbroek;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student student = new Student("Hans", 11);
        StudentView studentView = new StudentView(student);
        StudentController studentController = new StudentController(student, studentView);

        System.out.println(studentController.updateView());

        studentController.setStudentName("Frans");
        System.out.println(studentController.updateView());

        studentController.setStudentNumer(9000);
        System.out.println(studentController.updateView());


    }
}
