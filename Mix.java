public class Mix{
    int counter = 0;

    public static void main(String args[]) {
        int count = 0;

        Mix[] m = new Mix[20];
        int x = 0;

        while(x < 9) {
            m[x] = new Mix();
            m[x].counter = m[x].counter + 1;
            count = count + 1;
            count = count + m[x].maybeNew(x);

            System.out.println(count + " " + m[x].counter);
            x = x +1;
        }
    }

    public int maybeNew(int index){
        if (index < 5) {
            Mix m1 = new Mix();
            m1.counter = m1.counter + 1;

            return 1;
        }
        return 0;
    }
}