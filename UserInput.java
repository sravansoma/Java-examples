import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // scanners or buffered readers to take user input
        String str = "";

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        str = br.readLine();

        System.out.println("Hello " + str);

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println("Scanner string is " + str);
    }
}