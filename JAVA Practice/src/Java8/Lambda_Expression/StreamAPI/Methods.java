package Java8.Lambda_Expression.StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Methods {
    public static void main(String[] args) {

        //filter(Predicate)
            //boolean value function
            // e -> e>10

        List<String> names = List.of("Vivek", "Ankit","Abhinav", "Raju", "Aditya", "Arun");
        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newNames);

        names.stream().forEach(e -> {
            System.out.println(e);
        });

        newNames.stream().forEach(System.out::println);


        //map(Function)
            //each element operation

        List<Integer> numbers = List.of(1, 2, 0, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> newNumbers = numbers.stream().map(e -> e * e).collect(Collectors.toList());
        System.out.println("map " + newNumbers);

        //sorted
        numbers.stream().sorted().forEach(System.out::println);

        //min
        Integer integer = numbers.stream().min(Comparator.naturalOrder()).orElse(null);
        System.out.println("min" + integer);

        //max
        Integer integer1 = numbers.stream().max(Comparator.naturalOrder()).orElse(null);
        System.out.println("max " + integer1);

    }
}
