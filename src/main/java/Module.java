import java.util.ArrayList;

public class Module {

    private String name;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module(String name, String id){
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student s){
        if(students.contains(s)){
            return;
        }
        students.add(s);
        if(! s.getModules().contains(this)){
            s.addModule(this);
        }
    }

    public void addCourse(Course c){
        if(courses.contains(c)){
            return;
        }
        courses.add(c);
        if(!c.getModules().contains(this)){
            c.addModule(this);
        }
    }

    public String shallowToString(){
        return "Module{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public String toString() {
        String retString = shallowToString();
        retString += "\n\tStudents: ";
        for(Student stud: students){
            retString += "\n\t\t" + stud.shallowToString();
        }
        retString += "\n\tCourses: ";
        for(Course course: courses){
            retString += "\n\t\t" + course.shallowToString();
        }
        return retString;
    }
}
