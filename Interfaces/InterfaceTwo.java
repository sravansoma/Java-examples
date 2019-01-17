interface test {
    void show();
}

public class InterfaceTwo {
    public static void main(String[] args) {
        test obj = () -> System.out.println("I am in show");
        obj.show();
    }
}
