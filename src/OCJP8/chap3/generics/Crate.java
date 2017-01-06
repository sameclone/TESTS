package OCJP8.chap3.generics;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class Crate<T> {
    private T contents;

    public T emptyCrate(){
        return  contents;
    }

    public void packCrate(T contents){
        this.contents = contents;
    }
}
