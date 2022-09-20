public class Module {
    private String moduleName;
    private final int ID;
    private String[] studentsEnrolled;
    private String[] taughtBy;
    private String[] coursesAssociated;

    public Module(String name, int ID, String[] studentsEnrolled, String[] taughtBy, String[] coursesAssociated) {
        this.moduleName = moduleName;
        this.ID = ID;
        this.studentsEnrolled = studentsEnrolled;
        this.taughtBy = taughtBy;
        this.coursesAssociated = coursesAssociated;
    }
}
