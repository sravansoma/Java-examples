public class Fibonacci{
    public static void main(String[] args) {
        Fibonacci test = new Fibonacci();
        System.out.println(test.getFibonacciNum(10));
    }

    public int getFibonacciNum(int number) {

        if (number >= 3) {
            return getFibonacciNum(number - 1) + getFibonacciNum(number - 2);
        } else {
            return 1;
        }
    }
}