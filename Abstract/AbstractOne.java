public class AbstractOne {
    public static void main(String[] args) {
        Iphone p = new Iphone();
        Samsung s = new Samsung();
        show(s);
    }

    public static void show(Phone p) {
        p.myConfig();
    }
}

abstract class Phone{
    public abstract void myConfig();
}

class Iphone extends Phone{
    public void myConfig() {
        System.out.println("My config is Iphone");
    }
}

class Samsung extends Phone{
    public void myConfig() {
        System.out.println("My config is Samsung");
    }nmju8
}