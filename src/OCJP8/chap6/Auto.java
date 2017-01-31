package OCJP8.chap6;



/**
 * Created by yevgeniya.zuyeva on 31.01.2017.
 */
public class Auto implements AutoCloseable {
    int num;

    public Auto(int num) {
        this.num = num;
    }

    @Override
    public void close(){
        System.out.println("Close: "+num);
    }

    public static void main(String[] args){
        try(Auto a1 =new Auto(1); Auto a2 = new Auto(2)){
            throw new RuntimeException();
        }
        catch (Exception ex){
            System.out.println("ex");
        }
        finally {
            System.out.println("finally");
        }
    }
}
