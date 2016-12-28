package OCJP8.asessmentTest;

/**
 * Created by yevgeniya.zuyeva on 28.12.2016.
 */
public class VisitPark {
    enum AnimalsInPark{
        SQUIRREL, CHIPMUNK, SPARROW;
    }

    public static void main(String[] args){
        AnimalsInPark[] animalsInParks = AnimalsInPark.values();
        System.out.println(animalsInParks[1]);
    }

}
