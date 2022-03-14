import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIsStudentCreated(){
        Student ed = new Student(1L, "Edd");
        assertNotNull(ed);

        Student studentNull = null;
        assertNull(studentNull);
    }

    @Test
    public void testGetIdWorks(){
        Student ed = new Student(1L, "Edd");
        long actual = 1L;
        assertEquals(actual, ed.getId());

        Student luna = new Student(2L, "Luna");
        assertEquals(2l, luna.getId());
    }

    @Test
    public void testGetNameWorks(){
        Student ed = new Student(1L, "Edd");
        assertEquals("Edd", ed.getName());

        Student luna = new Student(2L, "Luna");
        assertEquals("Luna", luna.getName());
    }

    @Test
    public void testGetGradesWorks(){
        Student ed = new Student(1L, "Edd");
        ArrayList<Integer> test = new ArrayList<>();
        assertEquals(test, ed.getGrades());
        ed.addGrade(90);
        assertSame(90, ed.getGrades().get(0));
        ed.addGrade(80);
        assertSame(80, ed.getGrades().get(1));

        Student luna = new Student(2L, "Luna");
        assertEquals(test, luna.getGrades());
        luna.addGrade(90);
        assertSame(90, luna.getGrades().get(0));
        luna.addGrade(88);
        assertSame(88, luna.getGrades().get(1));

    }


    @Test
    public void testAddGradesWorks(){
        Student ed = new Student(1L, "Edd");
        assertEquals(0, ed.getGrades().size());
        ed.addGrade(90);
        assertEquals(1, ed.getGrades().size());
    }

    @Test
    public void testGetGradeAverageWorks(){
        Student ed = new Student(1L, "Edd");
        ed.addGrade(100);
        ed.addGrade(90);
        assertEquals(95, ed.getGradeAverage(), 0);
        Student luna = new Student(2L, "Luna");
        luna.addGrade(90);
        luna.addGrade(73);
        assertEquals(81.5, luna.getGradeAverage(), 0);


    }
}
