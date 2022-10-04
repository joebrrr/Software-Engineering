import org.joda.time.LocalDate;
import java.util.ArrayList;

public class Student {
    private String name, course;
    private ArrayList<Module> modules;
    private int age;
    private final int ID;
    private LocalDate DOB;

    public Student(String name, String course, int age, int ID, LocalDate DOB) {
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
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getUsername() {
        return name + ID;
    }

    public String getName() {
        return name;
    }
}
