package Serializable;

import java.util.List;

public class College {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudent(List<Student> students) {
        this.students = students;
    }
}