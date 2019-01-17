interface test {
    void show();
}

class MyImplement implements test {
    public void show() {
        System.out.println("I am in show");
    }
}

public class Interface {
    public static void main(String[] args) {
        test obj = new MyImplement();
        obj.show();
    }
}