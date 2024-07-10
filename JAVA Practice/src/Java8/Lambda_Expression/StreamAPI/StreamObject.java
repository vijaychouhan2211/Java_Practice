package Java8.Lambda_Expression.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //Stream API - collection process
        //collection / group of object

        //1-blank
        Stream<Object> emptyStream  = Stream.empty(); //stream type of object
        emptyStream.forEach(e -> {
            System.out.println(e);
        });

        //2-array,object,collection
        String name[] = {"Rivam","Sam","Bhoomi","Ankit"};

        Stream<String> stream1 = Stream.of(name);
        stream1.forEach(e-> {
            System.out.println(e);
        });

        //3- Builder Pattern
        Stream<Object> streamBuilder = Stream.builder().build();

        //4 Arrays
        IntStream stream = Arrays.stream(new int[]{1,2,3});
        stream.forEach(e -> {
            System.out.println(e);
        });

        //5 List, set
        List<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(45);
        list2.add(78);
        list2.add(11);
        list2.add(5);
        list2.add(28);

        Stream<Integer> stream2 = list2.stream();
        stream2.forEach(e -> {
            System.out.println(e);
        });


    }
}
