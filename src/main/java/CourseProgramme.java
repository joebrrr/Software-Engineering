import org.joda.time.LocalDate;
import java.util.ArrayList;

public class CourseProgramme {
    private String courseName;
    private ArrayList<Student> students;
    private ArrayList<Module> module;
    private LocalDate startDate, endDate;

    public CourseProgramme(String courseName, LocalDate startDate, LocalDate endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

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

    public ArrayList<Module> getModule() {
        return module;
    }

    public void setModule(ArrayList<Module> module) {
        this.module = module;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString(){
        String studentsEnrolled = "";
        String modules = "";

        for(Student student : students) {
            studentsEnrolled += "\n" + student;
        }

        for(Module moduleAssociated : module){
            modules += "\n" + moduleAssociated;
        }
        return "Course name: " + getCourseName() + "\nStudents Enrolled in course: " + studentsEnrolled + "\nModules Associated with this course: " + modules;
    }
}
