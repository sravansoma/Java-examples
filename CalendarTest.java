import java.util.Calendar;

public class CalendarTest{
    public static Calendar cal = Calendar.getInstance();

    public static void main(String[] args){
        cal.set(2004, 0, 7, 15, 40);

        System.out.println("Time is " + cal.getTime());
        cal.add(cal.DATE, 35);
        System.out.println("Time is " + cal.getTime());
        cal.roll(cal.DATE, 35);
        System.out.println("Time is " + cal.getTime());
        cal.set(cal.DATE, 1);
        System.out.println("Time is " + cal.getTime());
    }
}