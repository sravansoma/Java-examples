public class SuperKey{
    public static void main(String[] args) {
        SuperKey1 a = new SuperKey1(1);
        SuperKey2 b = new SuperKey2(5);
        b.show();
        b.test();
    }
}

class SuperKey1 {
    int i = 5;
    public SuperKey1() {
        System.out.println("In Constructor SuperKey1");
    }

    public void test() {
        System.out.println("Parents test method");
    }

    public SuperKey1(int i) {
        System.out.println("In Constructor SuperKey1 integer");
    }
}

class SuperKey2 extends SuperKey1 {
    int i = 4;
    public SuperKey2() {
        super();
        System.out.println("In Constructor SuperKey2");
    }
    public SuperKey2(int i) {
        super(i);
        System.out.println("In Constructor SuperKey2 integer");
    }

    public void show() {
        System.out.println(super.i);
    }

    public void test() {
        super.test();
        System.out.println("child test method");
    }
}