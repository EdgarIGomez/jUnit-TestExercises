import java.util.ArrayList;

public class Student {

    private long id;

    private String name;

    private ArrayList<Integer> grades;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        grades = new ArrayList<>();
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for(double grade : this.grades){
            total += grade;
        }
        return total / grades.size();
    }

    public void replaceGrade(int grade, int index){
        this.grades.set(index, grade);
    }

    public void removeGrade(int index){
        this.grades.remove(index);
    }
}
