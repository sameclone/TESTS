package OCJP8.chap3.comparableXcomparator;

/**
 * Created by yevgeniya.zuyeva on 10.01.2017.
 */
public class Animal implements Comparable<Animal> {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }


    @Override
    public int compareTo(Animal o) {
        return this.getId() -o.getId();
    }

    public static void main(String[] args){
        Animal a1 = new Animal(5);
        Animal a2 = new Animal(7);

        System.out.println(a1.getId()+"?"+a2.getId()+"="+a1.compareTo(a2)); //-2
        System.out.println(a1.getId()+"?"+a1.getId()+"="+a1.compareTo(a1)); //0
        System.out.println(a2.getId()+"?"+a1.getId()+"="+a2.compareTo(a1)); //2
    }
}
