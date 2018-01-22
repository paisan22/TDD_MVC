package nl.paisanrietbroek;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by paisanrietbroek on 22/01/2018.
 */
public class StudentViewTest {


    private StudentView studentView;

    @Before
    public void setup() {
        this.studentView = new StudentView(new Student("hans", 11));
    }

    @Test
    public void testViewCreation() {

        // assert
        assertThat(studentView, isA(StudentView.class));
    }

    @Test
    public void testGetStudentInfo() {

        // act
        String result = studentView.getInfo();

        // assert
        assertThat(result, is("Name: hans || Number: 11"));
    }

}
