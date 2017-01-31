package OCJP8.chap6;

/**
 * Created by yevgeniya.zuyeva on 30.01.2017.
 */
public class JammedTurkeyCage implements AutoCloseable {
    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }

    public static void main(String[] args){
        try(JammedTurkeyCage t = new JammedTurkeyCage()){
            System.out.println("put turkeys in");
            throw new IllegalStateException("turkeys ran off");
        }
        catch (IllegalStateException e){
            System.out.println("caught: "+e.getMessage());
            for(Throwable t: e.getSuppressed())
                System.out.println(t.getMessage());
        }


        System.out.println("-----------------------");


        try(JammedTurkeyCage t = new JammedTurkeyCage()){
          //  throw new RuntimeException("turkeys ran off");
        }
        catch (IllegalStateException e){
            System.out.println("caught: "+e.getMessage());

        }


        System.out.println("-----------------------");

        try(JammedTurkeyCage t1 = new JammedTurkeyCage();
            JammedTurkeyCage t2 = new JammedTurkeyCage()){
            System.out.println("turkeys entered cages");
        }
        catch (IllegalStateException e){
                System.out.println("caught: "+e.getMessage());
                System.out.println("Suppressed: ");

            for(Throwable t: e.getSuppressed())
                System.out.println(t.getMessage());
        }


        System.out.println("------Doesn't throw suppressed exception---------");

        try(JammedTurkeyCage t1 = new JammedTurkeyCage()){
            throw new IllegalStateException("turkeys ran off");
        }
        finally {
            //since  this line throws exception? previous exception is lost
            throw new RuntimeException("and we couldn't find them");
        }

    }
}
