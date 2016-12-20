package whiz;

import java.util.stream.Stream;

/**
 * Created by yevgeniya.zuyeva on 07.12.2016.
 */
public class Tester1Q1 {
    public static void main(String[] args){

        Stream<Student> stream = Stream.of(new Student("Buddiha"), new Student("Livera"), new Student("Sameera"));
        Stream<String> strings = stream.map(s->s.getName());
        strings.forEach(System.out::println);

    }
}

class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
