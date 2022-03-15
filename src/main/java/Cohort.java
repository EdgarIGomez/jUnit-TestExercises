import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private List<Student> students;

    public Cohort(){
        this.students = new ArrayList<>();
    }

    public double getCohortAverage(){
        double average = 0;

        for(Student student : this.students){
            average += student.getGradeAverage();
        }

        return average / students.size();
    }

    public List<Student> getStudents(){
        return this.students;
    }
}
