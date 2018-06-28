public class Duck{
    int size;

    public Duck(int duckSize) {
        System.out.println("Quack");
        size = duckSize;
        System.out.print("The Duck size is" + size);
    }

    public Duck() {
        System.out.println("Quack");
        size = 27;
        System.out.print("The Duck size is" + size);
    }
}