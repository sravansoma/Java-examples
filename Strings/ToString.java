public class ToString{
    public static void main(String[] args) {
        Student s1 = new Student(100, "sravan");

        System.out.println("Student name is " + s1.sname);
        System.out.println("Student roll number is " + s1.rollno);

        System.out.println(s1);
    }
}

class Student {
    int rollno;
    String sname;

    public Student(int rollno, String sname) {
        this.rollno = rollno;
        this.sname = sname;
    }

    public String toString() {
        return rollno + " : " + sname;
    }
}