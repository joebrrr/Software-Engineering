import java.util.ArrayList;

public class Module {
    private String moduleName;
    private final int ID;
    private ArrayList<Student> studentsEnrolled;
    private ArrayList<Lecturer> taughtBy;
    private ArrayList<CourseProgramme> coursesAssociated;

    public Module(String moduleName, int ID) {
        this.moduleName = moduleName;
        this.ID = ID;
    }

    public void addStudent(Student student) {
        studentsEnrolled.add(student);
    }

    public void addLecturer(Lecturer lecturer) {
        taughtBy.add(lecturer);
    }

    public void addCourse(CourseProgramme course) {
        coursesAssociated.add(course);
    }
}
