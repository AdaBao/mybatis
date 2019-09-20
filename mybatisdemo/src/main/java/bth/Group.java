package bth;

import java.util.Iterator;
import java.util.Set;

public class Group {
    private int id;
    private String name;
    private Set<Student> students;

    public Group(){}



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void printGroup(){
        Iterator<Student> iterator = students.iterator();

        while(iterator.hasNext()){
            Student stu = iterator.next();
            System.out.println(stu);
        }
    }
}
