public class Wrapper{
    public static void main(String[] args) {
        int i = 5;

        Integer ii = new Integer(i); // wrapping
        Integer j = ii.intValue(); // auto wrapping

//        int j = jj.intValue(); // unboxing
//        int k = jj; // auto unboxing

        System.out.println("Int value for jj is " + j);
    }
}