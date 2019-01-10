public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        Factorial recur = new Factorial();
        System.out.println(recur.getFactorial(number));
    }

    public int getFactorial(int num) {

        if (num >= 1) {
            return num * getFactorial(num - 1);
        } else {
            return 1;
        }
    }
}