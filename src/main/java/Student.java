import org.joda.time.LocalDate;
import java.util.ArrayList;

public class Student {
    private final String name;
    private ArrayList<Module> modules;
    private final int age;
    private final int ID;
    private final LocalDate DOB;
    private CourseProgramme courseRegistered;

    /*
     * name, dob, age, id are all 'final' as I deemed them to be immutable.
     * This is also reflected in the fact that they have no setter methods
     */
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

    //getter + setter methods, age, dob and name have no setters by design, as they are immutable attributes and are set in the constructor
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

    //by design the toString method does not print course or modules, as Students are printed by the toString method of these objects, meaning it would be open to circular logic
    @Override
    public String toString() {
        return "\nStudent name: " + getName() + "\nStudent ID: " + getID() + "\nStudent Username: " + getUsername()  + "\nStudent Age: " + getAge();
    }
}
