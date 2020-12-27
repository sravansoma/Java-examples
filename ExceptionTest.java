import java.util.*;

public class ExceptionTest{

    public static void main(String[] args) {
        String test = "no";

        try {
            System.out.println("Strat Try");
            doRisky(test);
            System.out.println("End Try");
        } catch(ScaryException ex) {
            System.out.println("We are in scary Exception");
        }
        finally{
            System.out.println("We are in Final Block");
        }
        System.out.println("End of the main method");
    }

    static void doRisky(String test) throws ScaryException {
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("End Risky Exception");
        return;
    }
}