public class Recursive {
    public static void main(String[] args) {
        int number = 4;
        Recursive recur = new Recursive();
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