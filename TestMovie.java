public class TestMovie {
    public static void main(String[] args) {
        // using movie class first time
        Movie one = new Movie();
        one.title = "Thammudu";
        one.genre = "Love";
        one.rating = 5;

        Movie two = new Movie();
        two.title = "Tholi Prema";
        two.genre = "Love";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Atharintiki Daredi";
        three.genre = "Love";
        three.rating = 5;

    }
}