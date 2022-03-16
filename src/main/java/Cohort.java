import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private List<Student> students;

    public Cohort(){
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public List<Student> getStudents(){
        return this.students;
    }

    public double getCohortAverage(){
        double average = 0;

        for(Student student : this.students){
            average += student.getGradeAverage();
        }

        return average / students.size();
    }

    public Student getStudentById(long id){
        for(Student student : this.students){
            if(id == student.getId()){
                return student;
            }
        }
        return this.students.get(0);
    }

}
