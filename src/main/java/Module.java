public class Module {
    private String moduleName;
    private final int ID;
    private Student[] studentsEnrolled;
    private String[] taughtBy;
    private String[] coursesAssociated;

    public Module(String moduleName, int ID, Student[] studentsEnrolled, String[] taughtBy, String[] coursesAssociated) {
        this.moduleName = moduleName;
        this.ID = ID;
        this.studentsEnrolled = studentsEnrolled;
        this.taughtBy = taughtBy;
        this.coursesAssociated = coursesAssociated;
    }
}
