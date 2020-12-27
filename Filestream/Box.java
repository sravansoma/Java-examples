import java.io.*;

public class Box implements Serializable {
    private int width;
    private int height;

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public static void main (String[] args) {
        Box mybox = new Box();
        mybox.setHeight(300);
        mybox.setWidth(400);

        try{
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(mybox);
            os.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}