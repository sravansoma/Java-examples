public class FinalKey {
    public static void main(String[] args) {
        final int i = 5;
        System.out.println(i);

        B obj = new B();

        obj.show();
    }
}

final class A {
    final public void show() {
        System.out.println("I am in A");
    }
}

class B {
//    public void show() {
//        System.out.println("I am in B");
//    }
}