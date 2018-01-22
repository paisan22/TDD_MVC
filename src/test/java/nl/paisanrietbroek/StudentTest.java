package nl.paisanrietbroek;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by paisanrietbroek on 22/01/2018.
 */

public class StudentTest {

    private Student student;

    @Before
    public void setup() {
        student = new Student("hans", 11);
    }

    @Test
    public void testStudentCreation() {

        // assert
        assertThat(student, isA(Student.class));
    }

    @Test
    public void testGetName() {

        // act
        String result = student.getName();

        // assert
        assertThat(result, is("hans"));
    }

    @Test
    public void testSetName() {

        // act
        student.setName("Frans");

        // assert
        assertThat(student.getName(), is("Frans"));
    }

    @Test
    public void testGetStudentNumber() {

        // assert
        assertThat(this.student.getNumber(), is(11));
    }


}
