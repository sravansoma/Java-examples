public class TestBook{
    public static void main(String[] args) {
        Book[] myBooks = new Book[3];

        int x = 0;

        myBooks[0] = new Book();
        myBooks[1] = new Book();
        myBooks[2] = new Book();

        myBooks[0].title = "Harry Potter";
        myBooks[0].author = "Some Author";

        myBooks[1].title = "XXXXXX";
        myBooks[1].author = "Some Author";

        myBooks[2].title = "XXXXXX3";
        myBooks[2].author = "Some Author3";

        while(x < 3) {
            System.out.println(myBooks[x].title);
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}