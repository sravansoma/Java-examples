import java.io.*;

public class WriteAFile{
    public static void main(String[] args) {
        try{
            FileWriter sampleFile = new FileWriter("simple.txt");
            sampleFile.write("Hello Buddy");
            sampleFile.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
    }
}