package Serializable;

public class Student{

    private int rollno;
    private String sname;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String toStirng() {
        return "Student{" + "rooolno=" + rollno + ", sname=" + sname + "}";
    }

}