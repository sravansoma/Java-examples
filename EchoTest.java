public class EchoTest{
    public static void main(String[] args) {
        Hello e1 = new Hello();
        Hello e2 = new Hello();

        int x = 0;
        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 3;

            if (x == 3) {
                e2.count = e2.count - 3;
            }

            if (x > 0) {
                e2.count = e2.count + e1.count;
            }
            x= x + 1;
        }
        System.out.println(e2.count);
    }
}