public class StaticPlayerTest{
    public static void main(String[] args) {
        System.out.println(StaticPlayer.playerCount);
        StaticPlayer s = new StaticPlayer("Sravan");
        System.out.println(StaticPlayer.playerCount);
    }
}