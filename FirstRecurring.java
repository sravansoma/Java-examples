import java.util.*;

public class FirstRecurring{
    public static void main(String[] args) {
        char[] strings = new char[5];    
        strings[0] = 'A';
        strings[1] = 'B';
        strings[2] = 'B';
        strings[3] = 'C';
        strings[4] = 'A';

        Object stringVal = new Object();
        int inc = 1;

        System.out.print(strings);

        for(int i=0; i<strings.length; i++) {
            if (!stringVal[strings[i]]) {
                stringVal[strings[i]] = inc;
            } else if (stringVal[strings[i]]) {
                stringVal.strings[i]++;
            }
            if (stringVal.strings[i] > 1) {
                return strings[i];
            }
        }
    }
}