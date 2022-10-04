import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

/*
 * A JUnit test class to test if the getUsername() method works in the Student and Lecturer classes
 */
public class TestMethods {
    @Test
    public void testGetUsername(){
        Student testStudent = new Student("Paul", "4BCT", 21, 51525, LocalDate.parse("2001-04-15"));
        assert testStudent.getUsername().equals("Paul51525") : "The Student method getUsername method is not working as expected";

        Lecturer testLecturer = new Lecturer(53089, "Patrick", 55, LocalDate.parse("1966-12-30"));
        assert testLecturer.getUsername().equals("Patrick53089") : "The Lecturer method getUsername method is not working as expected";
    }
}

