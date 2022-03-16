import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

public class CohortTest {

    Cohort sirius;
    Student ed;
    Student luna;

    @Before
    public void init(){
        sirius = new Cohort();
        ed = new Student(1L,"Eddy");
        ed.addGrade(100);
        ed.addGrade(90);
        sirius.addStudent(ed);
        luna = new Student(2L,"Luna");
    }

    @Test
    public void testIsCohortCreated(){
        assertNotNull(sirius);

        Cohort notSirius = null;
        assertNull(notSirius);
    }

    @Test
    public void testAddStudentsWorks(){
        assertEquals(1, sirius.getStudents().size());
        sirius.addStudent(luna);
        assertEquals(2, sirius.getStudents().size());
    }

    @Test
    public void testGetStudentsWorks(){
        List<Student> test = new ArrayList<>();
        assertEquals(test, sirius.getStudents());
        assertEquals(ed, sirius.getStudents().get(0));
        sirius.addStudent(luna);
        assertEquals(luna, sirius.getStudents().get(1));

    }

    @Test
    public void testGetCohortAverageWorks(){
        assertEquals(95.0, sirius.getCohortAverage(), 0);
        luna.addGrade(100);
        luna.addGrade(80);
        sirius.addStudent(luna);
        assertEquals(92.5, sirius.getCohortAverage(),0);
    }

}

