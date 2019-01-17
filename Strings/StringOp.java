import java.util.Scanner;

public class StringOp{
    public static void main(String[] args) {
        String s1,s2;
        boolean b1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first string");
        s1 = sc.nextLine();
        System.out.println("Please enter second string");
        s2 = sc.nextLine();

        int l1 = s1.length();
        int l2 = s2.length();

        System.out.println("First string length is " + l1);
        System.out.println("Second string length is " + l2);

        b1 = sc.nextBoolean();
        System.out.println("Next Boolean is " + b1);

        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}