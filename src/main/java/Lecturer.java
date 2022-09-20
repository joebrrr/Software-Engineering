import org.joda.time.DateTime;

public class Lecturer {

    private String name, username;
    private String[] modulesTaught;
    private int age;
    private final int ID;
    private DateTime DOB;

    public DateTime getDOB() {
        return DOB;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String[] getModulesTaught() {
        return modulesTaught;
    }

    public void setModulesTaught(String[] modulesTaught) {
        this.modulesTaught = modulesTaught;
    }

    public Lecturer(int ID, String name, String[] modulesTaught, int age, DateTime DOB) {
        this.ID = ID;
        this.name = name;
        this.modulesTaught = modulesTaught;
        this.age = age;
        this.DOB = DOB;
    }
    public String getUsername() {
        return name + ID;
    }

}
