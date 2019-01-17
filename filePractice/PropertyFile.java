import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFile{
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        OutputStream os = new FileOutputStream("config.properties");

        p.setProperty("url", "localhost:3306/myObj");
        p.setProperty("uname", "sravan");
        p.setProperty("password", "xxxx");

        p.store(os, null);

        InputStream is = new FileInputStream("config.properties");
        p.load(is);

//        System.out.println(p.getProperty("uname"));
//        System.out.println(p.getProperty("url"));
        // prints all the values
        p.list(System.out);
    }
}