import java.util.ArrayList;

public class Module {

    private String name;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module(String name, String id){
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<Course>();
        this.students = new ArrayList<Student>();
    }

    //TODO mutators for courses and enrolled students

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void addStudent(Student s){
        if(this.students.contains(s)){
            return;
        }
        this.students.add(s);
        if(! s.getModules().contains(this)){
            s.addModule(this);
        }
    }

    public void addCourse(Course c){
        if(this.courses.contains(c)){
            return;
        }
        this.courses.add(c);
        if(!c.getModules().contains(this)){
            c.addModule(this);
        }
    }

    @Override
    public String toString() {
        return "Module{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", students=" + students +
                ", associatedCourses=" + courses +
                '}';
    }
}
