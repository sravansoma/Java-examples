import java.util.Date;

public class MainClass{

    public static void main(String[] args){
        Date d = new Date();

        String fullDate = String.format("%tc", d);
        String justTime = String.format("%tr", d);
        String monthDateWeek = String.format("%tA, %tB %td", d, d, d);
        String usePrevArg = String.format("%tA, %<tB %<td", d);

        System.out.println(fullDate);
        System.out.println(justTime);
        System.out.println(monthDateWeek);
        System.out.println(usePrevArg);
    }
}