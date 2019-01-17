//package javaexamples.exception;

public class DemoException {
    public static void main(String[] args) {
        int i, j, k = 0;
        int a[] = new int[4];
        i=8;
        j=2;

        try {
            k=i/j;

            for (int c=0; c<=4; c++) {
                a[c] = c + 1;
            }

            for (int value : a) {
                System.out.println(value);
            }
        } catch (ArithmeticException e) {
            System.out.println("There is an exception here" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is an ArrayIndexOutOfBoundsException here" + e);
        }

        System.out.println(k);
    }
}