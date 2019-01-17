import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import filePractice.Student;

public class SerializableXml {
    public static void main(String[] args) {
        try {
            Student st1 = new Student();
            st1.setRollno(101);
            st1.setSname("sravan");

            Student st2 = new Student();
            st1.setRollno(102);
            st1.setSname("kumar");

            List<Student> s = new ArrayList<>();
            s.add(st1);
            s.add(st2);

            College c = new College();
            c.setStudent(s);

            XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("students.xml")));
            x.writeObject(c);
            x.close();
        } catch (FileNotFoundException e) {
            Logger.getLogger(SerializableXml.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}