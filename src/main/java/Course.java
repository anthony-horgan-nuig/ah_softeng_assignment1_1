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
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void addStudent(Student s){
        if(students.contains(s)){
            return;
        }
        students.add(s);
        if(! s.getCourses().contains(this)){
            s.addCourse(this);
        }
    }

    public void addModule(Module m){
        if(modules.contains(m)){
            return;
        }
        modules.add(m);
        if(! m.getCourses().contains(this)){
            m.addCourse(this);
        }
    }

    public String shallowToString(){
        return "Course{" +
                "name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    @Override
    public String toString() {
        String retString = shallowToString();
        retString += "\n\tModules: ";
        for(Module mod : modules){
            retString += "\n\t\t" + mod.shallowToString();
        }
        retString += "\n\tStudents: ";
        for(Student stud: students){
            retString += "\n\t\t" + stud.shallowToString();
        }
        return retString;
    }
}
