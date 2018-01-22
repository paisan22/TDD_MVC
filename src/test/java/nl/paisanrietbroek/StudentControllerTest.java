package nl.paisanrietbroek;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by paisanrietbroek on 22/01/2018.
 */
public class StudentControllerTest {

    private StudentController studentController;

    @Before
    public void setup() {
        Student student = new Student();
        StudentView studentView = new StudentView(student);
        this.studentController = new StudentController(student, studentView);
    }

    @Test
    public void testControllerCreation() {

        // assert
        assertThat(studentController, isA(StudentController.class));
    }

    @Test
    public void testSetStudentName() {

        // act
        studentController.setStudentName("Frans");

        // assert
        assertThat(studentController.getStudent().getName(), is("Frans"));
    }

    @Test
    public void testSetStudentNumber() {

        // act
        studentController.setStudentNumer(55);
        int result = studentController.getStudent().getNumber();

        // assert
        assertThat(result, is(55));
    }

    @Test
    public void testUpdateView() {

        // arrange
        studentController.setStudentName("Henk");
        studentController.setStudentNumer(9000);

        // act
        String result = studentController.updateView();

        // assert
        assertThat(result, is("Name: Henk || Number: 9000"));
    }

}
