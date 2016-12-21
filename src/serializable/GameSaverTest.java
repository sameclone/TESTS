package serializable;

import java.io.*;

/**
 * Created by yevgeniya.zuyeva on 21.12.2016.
 */
public class GameSaverTest {
    public static void main(String[] args){
        GameCharacter one = new GameCharacter(50,"Elf", new String[]{"bow", "sword", "dildo 0.o"});
        GameCharacter two = new GameCharacter(200,"Troll", new String[]{"muscules","big axe"});
        GameCharacter three = new GameCharacter(120,"Wizard", new String[]{"spell","invisibility"});

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"))){
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);

        } catch (IOException e) {
            e.printStackTrace();
        }

        one = null;
        two=null;
        three=null;

        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"))){
            GameCharacter oneRestore = (GameCharacter)is.readObject();
            GameCharacter twoRestore = (GameCharacter)is.readObject();
            GameCharacter threeRestore = (GameCharacter)is.readObject();

            System.out.println(oneRestore);
            System.out.println(twoRestore);
            System.out.println(threeRestore);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
