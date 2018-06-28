public class ConditionDog{
    int size;
    String name;

    public void bark() {
        if (size > 50) {
            System.out.println("Bowwwwwwwww Bowwwwww");
        } else if (size < 30) {
            System.out.println("Howwwwww Howwwwwww");
        } else {
            System.out.println("Burrrrrrrr");
        }
    }
}