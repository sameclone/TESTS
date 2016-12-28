package OCJP8.asessmentTest;

/**
 * Created by yevgeniya.zuyeva on 28.12.2016.
 */

import java.lang.reflect.Array;
import java.util.List;
import java.util.function.Predicate;

/**
 * creating immetable object
 * ->Mark name and ducklings final
 * ->mark the Duck class final
 * ->Replace getDucklings() with a method or methods that do not give the caller direct access to the List<Duck> ducklings
 */
public final class Duck {
    private final String name;
    private final List<Duck> ducklings;

    public Duck(String name, List<Duck> ducklings) {
        this.name = name;
        this.ducklings = ducklings;
    }

    public String getName() {
        return name;
    }

    /* public List<Duck> getDucklings(){return  ducklings;}*/
    public Duck[] getDucklings() {
        return (Duck[]) ducklings.toArray();
    }

    public String hasDucklings(Predicate<Duck> predicate) {
        return predicate.test(this) ? "Quack Quack" : "";
    }


}
