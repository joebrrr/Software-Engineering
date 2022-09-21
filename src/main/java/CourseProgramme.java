import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.Date;

public class CourseProgramme {
    private String courseName;
    private String[] students, modules;
    private LocalDate startDate, endDate;

    public CourseProgramme(String courseName, String[] students, String[] modules, LocalDate startDate, LocalDate endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.students = students;
        this.modules = modules;
    }
}
