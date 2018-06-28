public class Hobbits{
    String name;
    public static void main(String[] args){
        Hobbits[] h = new Hobbits[3];
        int y = 0;
        
        while(y < 4) {
            y = y + 1;
            h[y] = new Hobbits();
            h[y].name = "bilbo";

            if (y == 1) {
                h[y].name = "Its 1";
            }

            if (y == 2) {
                h[y].name = "Its 2";
            }

            System.out.print("The name is" + h[y].name);
            System.out.println("Good Habit Name");
        }
    }
}