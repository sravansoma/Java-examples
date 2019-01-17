public class Abstract {
    public static void main(String[] args) {
        iphoneLatest obj = new iphoneLatest();
        obj.call();
        obj.play();
        obj.notes();
        obj.videos();
    }
}

abstract class phone { // abstract class
    public void call() {
        System.out.println("Calling....");
    }
    public abstract void play();
    public abstract void notes();
    public abstract void videos();
}

abstract class iphone extends phone { // abstract class
    @Override
    public void play() {
        System.out.println("I am playing");
    }
}

class iphoneLatest extends iphone { // concrete class
    public void notes() {
        System.out.println("I am writing notes");
    }
    public void videos() {
        System.out.println("I am playing videos");
    }
}