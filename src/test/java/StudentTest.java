import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
    Student ed;
    Student luna;

    @Before
    public void init(){
        ed = new Student(1L, "Edd");
        ed.addGrade(100);
        ed.addGrade(90);
        luna = new Student(2L, "Luna");
        luna.addGrade(90);
        luna.addGrade(73);
    }

    @Test
    public void testIsStudentCreated(){
        assertNotNull(ed);

        Student studentNull = null;
        assertNull(studentNull);
    }

    @Test
    public void testGetIdWorks(){
        long actual = 1L;
        assertEquals(actual, ed.getId());

        assertEquals(2L, luna.getId());
    }

    @Test
    public void testGetNameWorks(){
        assertEquals("Edd", ed.getName());

        assertEquals("Luna", luna.getName());
    }

    @Test
    public void testGetGradesWorks(){
        assertSame(100, ed.getGrades().get(0));
        assertSame(90, ed.getGrades().get(1));

        assertSame(90, luna.getGrades().get(0));
        assertSame(73, luna.getGrades().get(1));

    }


    @Test
    public void testAddGradesWorks(){
        assertEquals(2, ed.getGrades().size());
        ed.addGrade(90);
        assertEquals(3, ed.getGrades().size());
    }

    @Test
    public void testGetGradeAverageWorks(){
        assertEquals(95, ed.getGradeAverage(), 0);

        assertEquals(81.5, luna.getGradeAverage(), 0);
    }

    @Test
    public void testReplaceGradeWorks(){
        ed.replaceGrade(90,0);
        assertSame(90, ed.getGrades().get(0));

        luna.replaceGrade(73,0);
        assertSame(73, luna.getGrades().get(0));
    }

    @Test
    public void testDeleteGradeWorks(){
        assertEquals(2, ed.getGrades().size());
        ed.removeGrade(0);
        assertEquals(1, ed.getGrades().size());
    }
}
