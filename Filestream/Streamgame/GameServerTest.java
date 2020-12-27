import java.io.*;

public class GameServerTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Elf", new String[] {"bow", "sword", "dust"});
        GameCharacter two = new GameCharacter(20, "Troll", new String[] {"bare hands", "big axe"});
        GameCharacter three = new GameCharacter(120, "Magician", new String[] {"spells", "invisibility"});

        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
        one = null;
        two = null;
        three = null;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println(oneRestore.getType());
            System.out.println(twoRestore.getType());
            System.out.println(threeRestore.getType());
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}