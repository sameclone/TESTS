package OCJP8.chap3.generics;

/**
 * Created by yevgeniya.zuyeva on 06.01.2017.
 */
public class SizeLimitedCrate<T,U> {
    private T contents;
    private U sizeLimit;

    public SizeLimitedCrate(T contents, U sizeLimit) {
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }


}
