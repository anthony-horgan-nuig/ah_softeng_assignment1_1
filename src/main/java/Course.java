import org.joda.time.LocalDate;

import java.util.ArrayList;

public class Course {

    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String name){
        this.name = name;
    }

    public Course(String name, LocalDate startDate, LocalDate endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.modules = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public ArrayList<Module> getModules() {
        return this.modules;
    }

    public void addStudent(Student s){
        if(this.students.contains(s)){
            return;
        }
        this.students.add(s);
        if(! s.getCourses().contains(this)){
            s.addCourse(this);
        }
    }

    public void addModule(Module m){
        if(this.modules.contains(m)){
            return;
        }
        this.modules.add(m);
        if(! m.getCourses().contains(this)){
            m.addCourse(this);
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", modules=" + modules +
                ", students=" + students+
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
