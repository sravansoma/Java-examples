public class Binary {
    int arr[] = {1, 2, 3, 4, 5};
    public static void main(String[] args) {
        Binary test = new Binary();
        test.testMethod(5);

    }

    public void testMethod(int num) {
        if (num < 1) {
            System.out.println(num);
        } else {
            arr[num-1] = 0;
            testMethod(num - 1);
            arr[num-1] = 1;
            testMethod(num - 1);
        }
    }
}
