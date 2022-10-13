import org.joda.time.LocalDate;
import java.util.ArrayList;

public class Student {
    private String name;
    private CourseProgramme course;
    private ArrayList<Module> modules;
    private int age;
    private final int ID;
    private LocalDate DOB;

    public Student(String name, CourseProgramme course, int age, int ID, LocalDate DOB) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.ID = ID;
        this.DOB = DOB;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDOB() { return DOB; }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public String getCourse() {
        return course.getCourseName();
    }

    public void setCourse(CourseProgramme course) {
        this.course = course;
    }

    public String getUsername() {
        return name + ID;
    }

    public String getName() {
        return name;
    }
}
