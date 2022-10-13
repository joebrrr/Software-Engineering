import org.joda.time.LocalDate;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Module> modules;
    private int age;
    private final int ID;
    private LocalDate DOB;

    public Student(String name, int age, int ID, LocalDate DOB) {
        this.name = name;
        this.age = age;
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

    public String getUsername() {
        return name + ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nStudent name: " + getName() + "\nStudent Username: " + getUsername() + "\nStudent date of birth: " + getDOB() + "\nStudent Age: " + getAge();
    }
}
