public class WhileLoop {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("The loop has not yet started");
        while (x < 4) {
            x = x + 1;
            int localx = x - 1;
            System.out.println("Now the loop is at " + localx);
        }
        System.out.println("The loop is done.");
    }
}