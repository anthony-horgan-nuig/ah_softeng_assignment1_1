import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Student {
    private String name;
    private int age;
    private LocalDate dob;
    private int id;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;

    public Student(String name, int age, LocalDate dob, int id){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.courses = new ArrayList<Course>();
        this.modules = new ArrayList<Module>();
    }

    public String getUsername(){
        return this.name + this.age;
    }

    // basic getters and setters
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public ArrayList<Module> getModules() {
        return this.modules;
    }

    public void addCourse(Course c){
        if(this.courses.contains(c)){
            return;
        }
        this.courses.add(c);
        if(! c.getStudents().contains(this)){
            c.addStudent(this);
        }
    }

    public void addModule(Module m){
        if(this.modules.contains(m)){
            return;
        }
        this.modules.add(m);
        if(! m.getStudents().contains(this)){
            m.addStudent(this);
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", id=" + id +
                ", username=" + this.getUsername() +
                ", courses=" + courses +
                ", modules=" + modules +
                '}';
    }
}
