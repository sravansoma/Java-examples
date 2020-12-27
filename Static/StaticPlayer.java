public class StaticPlayer{

    static int playerCount;
    private String name;

    public StaticPlayer(String n){
        name = n;
        playerCount++;
    }
}