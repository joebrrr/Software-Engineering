import org.joda.time.LocalDate;
import java.util.ArrayList;

public class CourseProgramme {
    private String courseName;
    private ArrayList<Student> students;
    private ArrayList<Module> module;
    private LocalDate startDate, endDate;

    public CourseProgramme(String courseName, LocalDate startDate, LocalDate endDate) {
        //init empty arrays
        this.module = new ArrayList<Module>();
        this.students = new ArrayList<Student>();
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //getter + setter methods
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //Design choice: courses exist before modules, therefore the module will be added to the course and not vice-versa, meaning the course object should handle
    //the logic of adding itself to the modules 'CoursesAssociated' array
    public void addModule(Module mod) {
        module.add(mod);
        mod.addCourse(this);
    }

    public ArrayList<Module> getModule() {
        return module;
    }

    public void addStudent(Student stud) { students.add(stud); }

    public ArrayList<Student> getStudents() {
        return students;
    }

    //overridden toString method that prints the course name and all modules associated with it
    @Override
    public String toString(){
        String modules = "";

        for(Module moduleAssociated : module){
            modules += "\n" + moduleAssociated;
        }
        return "\nCourse name: " + getCourseName() + "\nModules Associated with this course: " + modules + "\n#############";
    }
}
