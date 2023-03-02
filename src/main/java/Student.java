import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer>grades;

    //Constructor
    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }
    //getter
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    //other stuff
    public double getGradeAverage(){
        double total = 0;
        for(double grade: grades){
            total += grade;

        }
        return total/grades.size();
    }

    public void addGrade(int grade){
        grades.add(grade);
    }


}
