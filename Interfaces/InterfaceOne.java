interface test {
    void show();
}

public class InterfaceOne {
    public static void main(String[] args) {
        test obj = new test(){
            public void show() {
                System.out.println("I am in show");
            }
        };
        obj.show();
    }
}
