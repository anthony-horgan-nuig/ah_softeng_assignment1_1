import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CourseTest {

    @Test
    public void getName() {
        String name = "Computer Science";
        LocalDate startDate = new LocalDate(2021, 8, 1);
        LocalDate endDate = new LocalDate(2026, 6, 1);
        Course course = new Course(name, startDate, endDate);
        assertEquals(name, course.getName());
    }

    @Test
    public void getStartDate() {
        String name = "Computer Science";
        LocalDate startDate = new LocalDate(2021, 8, 1);
        LocalDate endDate = new LocalDate(2026, 6, 1);
        Course course = new Course(name, startDate, endDate);
        assertEquals(startDate, course.getStartDate());
    }

    @Test
    public void getEndDate() {
        String name = "Computer Science";
        LocalDate startDate = new LocalDate(2021, 8, 1);
        LocalDate endDate = new LocalDate(2026, 6, 1);
        Course course = new Course(name, startDate, endDate);
        assertEquals(endDate, course.getEndDate());
    }

    @Test
    public void getStudents() {
        String name = "Computer Science";
        LocalDate startDate = new LocalDate(2021, 8, 1);
        LocalDate endDate = new LocalDate(2026, 6, 1);
        Course course = new Course(name, startDate, endDate);

        Student student1 = new Student("john", 22, new LocalDate(1996, 1, 2), 1234567);
        Student student2 = new Student("james", 21, new LocalDate(1993, 3, 12), 1234567);
        course.addStudent(student1);
        student2.addCourse(course);
        ArrayList<Student> expectedStudents = new ArrayList<>();
        expectedStudents.add(student1);
        expectedStudents.add(student2);
        assertEquals(expectedStudents, course.getStudents());
    }

    @Test
    public void getModules() {
        String name = "Computer Science";
        LocalDate startDate = new LocalDate(2021, 8, 1);
        LocalDate endDate = new LocalDate(2026, 6, 1);
        Course course = new Course(name, startDate, endDate);

        Module module1 = new Module("Geometry", "MA510");
        Module module2 = new Module("Programming 1", "CT110");
        course.addModule(module1);
        module2.addCourse(course);
        ArrayList<Module> expectedModules = new ArrayList<>();
        expectedModules.add(module1);
        expectedModules.add(module2);
        assertEquals(expectedModules, course.getModules());
    }
}