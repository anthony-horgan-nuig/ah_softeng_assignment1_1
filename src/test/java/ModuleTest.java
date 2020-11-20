import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ModuleTest {

    @Test
    public void getName() {
        String name = "Programming";
        String id = "CT112";
        Module m = new Module(name, id);
        assertEquals(name, m.getName());
    }

    @Test
    public void getId() {
        String name = "Programming";
        String id = "CT112";
        Module m = new Module(name, id);
        assertEquals(id, m.getId());
    }

    @Test
    public void getCourses() {
        String name = "Programming";
        String id = "CT112";
        Module module = new Module(name, id);
        Course course1 = new Course("GY50", new LocalDate(2020, 1, 9), new LocalDate(2024, 1, 5));
        Course course2 = new Course("GY11", new LocalDate(2020, 1, 9), new LocalDate(2026, 1, 5));
        module.addCourse(course1);
        course2.addModule(module);
        ArrayList<Course> expectedCourses = new ArrayList<Course>();
        expectedCourses.add(course1);
        expectedCourses.add(course2);
        assertEquals(expectedCourses, module.getCourses());
    }

    @Test
    public void getStudents() {
        String name = "Programming";
        String id = "CT112";
        Module module = new Module(name, id);

        Student student1 = new Student("john", 22, new LocalDate(1996, 1, 2), 1234567);
        Student student2 = new Student("james", 21, new LocalDate(1993, 3, 12), 1234567);
        module.addStudent(student1);
        student2.addModule(module);
        ArrayList<Student> expectedStudents = new ArrayList<Student>();
        expectedStudents.add(student1);
        expectedStudents.add(student2);
        assertEquals(expectedStudents, module.getStudents());
    }
}