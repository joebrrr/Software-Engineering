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

    public void setModulesTaught(ArrayList<Module> modulesTaught) {
        this.modulesTaught = modulesTaught;
    }

    public String getUsername() {
        return name + ID;
    }

    @Override
    public String toString() {
        String modules = "";
        for(Module module : modulesTaught) {
            modules += "\n" + modules;
        }
        return "Lecturer Name: " + getName() + "\nLecturer Username: " + getUsername() + "\nLecturer Age: " + getAge() + "\nModules Taught: " + modules;
    }
}
