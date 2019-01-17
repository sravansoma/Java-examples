import java.io.*;

public class SerialTest {
    public static void main(String[] args) throws Exception{
        Save obj = new Save();

        obj.i = 4;

        File f = new File("Obj.txt");
        FileOutputStream fs = new FileOutputStream(f);
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(obj);

        FileInputStream fi = new FileInputStream(f);
        ObjectInputStream oi = new ObjectInputStream(fi);
        Save obj1 = (Save) oi.readObject();

        System.out.println(obj1.i);
    }
}

class Save implements Serializable {
    int i;
}