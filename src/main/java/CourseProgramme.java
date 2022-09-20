import org.joda.time.DateTime;

import java.time.LocalDate;
import java.util.Date;

public class CourseProgramme {
    private String courseName;
    private String[] students, modules;
    private DateTime startDate, endDate;

    public CourseProgramme(String courseName, String[] students, String[] modules, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.students = students;
        this.modules = modules;
    }
}
