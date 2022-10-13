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

    public int getID() { return ID; }

    public String getModuleName() { return moduleName; }

    public void setModuleName(String moduleName) { this.moduleName = moduleName; }

    public ArrayList<CourseProgramme> getCoursesAssociated() { return coursesAssociated; }

    public void setCoursesAssociated(ArrayList<CourseProgramme> coursesAssociated) { this.coursesAssociated = coursesAssociated; }

    public ArrayList<Lecturer> getTaughtBy() { return taughtBy; }

    public void setTaughtBy(ArrayList<Lecturer> taughtBy) { this.taughtBy = taughtBy; }

    public ArrayList<Student> getStudentsEnrolled() { return studentsEnrolled; }

    public void setStudentsEnrolled(ArrayList<Student> studentsEnrolled) { this.studentsEnrolled = studentsEnrolled; }

    @Override
    public String toString() {
        String students = "";
        String lecturers = "";
        String courses = "";

        for(Student student : studentsEnrolled) {
            students += "\n" + student;
        }

        for(Lecturer lect : taughtBy){
            lecturers += "\n" + lect;
        }

        for(CourseProgramme course : coursesAssociated) {
            courses += "\n" + course;
        }

        return "Module name: " + getModuleName() + "\nModule ID: " + getID() + "\nCourses Associated with this module: " + courses + "\nTaught by: " + lecturers + "\nStudents Enrolled: " + students ;
    }

    /* public void addStudent(Student student) {
        studentsEnrolled.add(student);
    }

    public void addLecturer(Lecturer lecturer) {
        taughtBy.add(lecturer);
    }

    public void addCourse(CourseProgramme course) {
        coursesAssociated.add(course);
    }*/
}
