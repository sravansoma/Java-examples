import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException2{
    public static void main(String[] args) {
        int i,j = 0,k = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        i = 8;


        try {
            System.out.println("Please enter a number");
            j = Integer.parseInt(br.readLine());
            k = i/j;

            if (k < 10) {
                throw new ArithmeticException();
            }
            System.out.println("Output for the calculation " + k);
        } catch (IOException e) {
            System.out.println("I/O Error");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Error happend");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println(e);
            }
            System.out.println("All Done!!!!");
        }
    }
}