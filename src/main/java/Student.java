import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class Student {
    private String name, course;
    private String[] modules;
    private int age;
    private final int ID;
    private LocalDate DOB;

    public Student(String name, String course, int age, int ID, LocalDate DOB, String[] modules) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.ID = ID;
        this.DOB = DOB;
        this.modules = modules;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public String[] getModules() {
        return modules;
    }

    public void setModules(String[] modules) {
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
