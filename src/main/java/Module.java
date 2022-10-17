import java.util.ArrayList;

public class Module {
    private String moduleName;
    private final int ID;
    private ArrayList<Student> studentsEnrolled;
    private ArrayList<CourseProgramme> coursesAssociated;
    private Lecturer taughtBy;

    /*
     * module name is not final as in real life a modules name does change
     * hence why it also has a setter method
     */
    public Module(String moduleName, int ID, Lecturer taughtBy) {
        this.moduleName = moduleName;
        this.ID = ID;

        //initialize empty arrays for these variables, and then instead of a setter method, I have added a method that allows us to add individual objects to these arrays
        this.studentsEnrolled = new ArrayList<Student>();
        this.coursesAssociated = new ArrayList<CourseProgramme>();
        this.taughtBy = taughtBy;

        //add this module to the lecturer automatically
        this.taughtBy.addModule(this);
    }

    //getter + 'setter' methods that can add objects to the arrays initialized in the constructor
    public int getID() { return ID; }

    public String getModuleName() { return moduleName; }
    public void setModuleName(String moduleName) { this.moduleName = moduleName; }

    public void addStudent(Student student) { studentsEnrolled.add(student); }
    public ArrayList<Student> getStudentsEnrolled() { return studentsEnrolled; }

    public void addCourse(CourseProgramme course) { coursesAssociated.add(course); }

    public ArrayList<CourseProgramme> getCoursesAssociated() { return coursesAssociated; }

    public Lecturer getTaughtBy() { return taughtBy; }

    //overridden toString method, prints module details and lists all students enrolled
    @Override
    public String toString() {
        String students = "";

        for(Student student : studentsEnrolled) {
            students += "\n" + student;
        }

        return "\nModule name: " + getModuleName() + "\nModule ID: " + getID() + "\nTaught by: " + getTaughtBy() + "\nStudents Enrolled: " + students;
    }
}
