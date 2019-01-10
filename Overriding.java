public class Overriding{
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj2.show();
    }
}

class A {
    public void show() {
        System.out.println("In show A");
    }
}

class B extends A {
    public void show() {
        System.out.println("In show B");
    }

    public void show(int i) {
        System.out.println("In show B integer");
    }
}