import org.junit.Test;
import org.joda.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getUsername() {
        String name = "john";
        int age = 12;
        LocalDate dob = new LocalDate(1998, 4, 1);
        int id = 18773425;
        Student s = new Student(name, age, dob, id);
        assertEquals(name + " " + age, s.getUsername());
    }

    @Test
    public void getAge() {
        String name = "john";
        int age = 12;
        LocalDate dob = new LocalDate(1998, 4, 1);
        int id = 18773425;
        Student s = new Student(name, age, dob, id);
        assertEquals(age, s.getAge());
    }

    @Test
    public void getId() {
        String name = "john";
        int age = 12;
        LocalDate dob = new LocalDate(1998, 4, 1);
        int id = 18773425;
        Student s = new Student(name, age, dob, id);
        assertEquals(id, s.getId());
    }

    @Test
    public void getDob() {
        String name = "john";
        int age = 12;
        LocalDate dob = new LocalDate(1998, 4, 1);
        int id = 18773425;
        Student s = new Student(name, age, dob, id);
        assertEquals(dob, s.getDob());
    }

    @Test
    public void getName() {
        String name = "john";
        int age = 12;
        LocalDate dob = new LocalDate(1998, 4, 1);
        int id = 18773425;
        Student s = new Student(name, age, dob, id);
        assertEquals(name, s.getName());
    }

    @Test
    public void getCourses() {
        String name = "john";
        int age = 12;
        LocalDate dob = new LocalDate(1998, 4, 1);
        int id = 18773425;
        Student s = new Student(name, age, dob, id);
        Course course1 = new Course("GY50", new LocalDate(2020, 1, 9), new LocalDate(2024, 1, 5));
        Course course2 = new Course("GY11", new LocalDate(2020, 1, 9), new LocalDate(2026, 1, 5));
        s.addCourse(course1);
        course2.addStudent(s);
        ArrayList<Course> expectedCourses = new ArrayList<>();
        expectedCourses.add(course1);
        expectedCourses.add(course2);
        assertEquals(expectedCourses, s.getCourses());
    }

    @Test
    public void getModules() {
        String name = "john";
        int age = 12;
        LocalDate dob = new LocalDate(1998, 4, 1);
        int id = 18773425;
        Student s = new Student(name, age, dob, id);
        Module module1 = new Module("Geometry", "MA510");
        Module module2 = new Module("Programming 1", "CT110");
        s.addModule(module1);
        module2.addStudent(s);
        ArrayList<Module> expectedModules = new ArrayList<>();
        expectedModules.add(module1);
        expectedModules.add(module2);
        assertEquals(expectedModules, s.getModules());
    }
}