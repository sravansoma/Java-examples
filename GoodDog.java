public class GoodDog{
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Woof");
        } else if (size < 60) {
            System.out.println("hahhaha");
        } else {
            System.out.println("yoooooo");
        }
    }
}