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
        this.courses = new ArrayList<>();
        this.modules = new ArrayList<>();
    }

    public String getUsername(){
        return name + " " + age;
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

    public void addCourse(Course c){
        if(courses.contains(c)){
            return;
        }
        courses.add(c);
        if(! c.getStudents().contains(this)){
            c.addStudent(this);
        }
    }

    public void addModule(Module m){
        if(modules.contains(m)){
            return;
        }
        modules.add(m);
        if(! m.getStudents().contains(this)){
            m.addStudent(this);
        }
    }


    public String shallowToString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", id=" + id +
                ", username=" + getUsername() +
                '}';
    }

    @Override
    public String toString() {
        String retString = shallowToString();
        retString += "\n\tCourses: ";
        for(Course course: courses){
            retString += "\n\t\t" + course.shallowToString();
        }
        retString += "\n\tModules: ";
        for(Module mod : modules) {
            retString += "\n\t\t" + mod.shallowToString();
        }
        return retString;
    }
}
