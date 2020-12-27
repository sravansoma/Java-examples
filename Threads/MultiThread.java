public class MultiThread implements Runnable {
    public static void main(String[] args) {
        MultiThread test = new MultiThread();
        Thread first = new Thread(test);
        Thread second = new Thread(test);
        first.start();
        second.start();
    }

    public void run() {
        int i;
        for (i = 0; i < 25; i++) {
            String localThreadName = Thread.currentThread().getName();
            System.out.println(localThreadName + " is running");
        }
        System.out.println(i);
    }
}