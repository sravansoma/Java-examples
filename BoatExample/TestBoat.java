public class TestBoat{
    public static void main(String[] args){
        Boat b1 = new Boat();
        SailBoat b2 = new SailBoat();
        RowBat b3 = new RowBat();

        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}