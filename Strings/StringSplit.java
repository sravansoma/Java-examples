public class StringSplit{
    public static void main(String[] args) {
        String str = "Sravan, Kumar, Soma, Monica";

        String names[] = str.split(",");
7yr
        for (String val: names) {
            System.out.println(val);
        }
    }
}