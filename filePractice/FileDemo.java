import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileOutputStream;

public class FileDemo{
    public static void main(String[] args) throws Exception {
        File F = new File("demo.txt");
        FileOutputStream file = new FileOutputStream(F);
        DataOutputStream dos = new DataOutputStream(file);
        dos.writeUTF("Demo Content");

        FileInputStream fis = new FileInputStream(F);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
    }
}