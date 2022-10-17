import org.checkerframework.checker.units.qual.A;
import org.joda.time.LocalDate;
import java.util.ArrayList;

public class Lecturer {
    private String name, username;
    private ArrayList<Module> modulesTaught;
    private int age;
    private final int ID;
    private LocalDate DOB;

    public Lecturer(int ID, String name, int age, LocalDate DOB) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.modulesTaught = new ArrayList<Module>();
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Module> getModulesTaught() {
        return modulesTaught;
    }

    public void addModule(Module module) { modulesTaught.add(module); }

    public String getUsername() {
        return name + ID;
    }

    @Override
    public String toString() {
        return "Lecturer Name: " + getName() + "\nLecturer Username: " + getUsername() + "\nLecturer Age: " + getAge();
    }
}
