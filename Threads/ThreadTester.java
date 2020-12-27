public class ThreadTester{

    public static void main(String[] args) {
        Runnable myRun = new MyRunnable();
        Thread test = new Thread(myRun);
        test.start();
        System.out.println("Back to main");
    }
}