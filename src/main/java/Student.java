import org.joda.time.LocalDate;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Module> modules;
    private int age;
    private final int ID;
    private LocalDate DOB;
    private CourseProgramme courseRegistered;

    public Student(String name, int age, int ID, LocalDate DOB, CourseProgramme courseRegistered) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.courseRegistered = courseRegistered;
        this.DOB = DOB;

        //automatically add the student to the course
        courseRegistered.addStudent(this);
        //automatically get the list of modules from the course
        setModules(courseRegistered.getModule());

        //add student to modules associated with course
        for(Module mod: courseRegistered.getModule()) {
            mod.addStudent(this);
        }
    }

    public void setCourseRegistered(CourseProgramme course) { this.courseRegistered = course; }
    public CourseProgramme getCourseRegistered() { return courseRegistered; }

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
        return "\nStudent name: " + getName() + "\nStudent Username: " + getUsername()  + "\nStudent Age: " + getAge();
    }
}
