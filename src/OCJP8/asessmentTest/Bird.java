package OCJP8.asessmentTest;

import java.io.*;

/**
 * Created by yevgeniya.zuyeva on 28.12.2016.
 */
public class Bird implements Serializable{
    private String name;
    private transient int age;
    private Tail tail;

    public String getName(){return name;}
    public Tail getTail(){return tail;}
    public void setTail(Tail tail){
        this.tail = tail;
    }
    public int getAge(){return  age;}
    public void setAge(int age){this.age = age;}

    public static void main(String[] args){
        try(ObjectInputStream is = new ObjectInputStream(new BufferedInputStream(new FileInputStream("birds.dat")))){
            Bird bird = (Bird) is.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Tail{}
