import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Student {
    private String name;
    private int age;
    private LocalDate dob;
    // TODO maybe change id to string
    private int id;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;
    // TODO see about adding username attribute

    public Student(String name, int age, LocalDate dob, int id){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
    }

    // basic getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", id=" + id +
                ", courses=" + courses +
                ", modules=" + modules +
                '}';
    }
}
