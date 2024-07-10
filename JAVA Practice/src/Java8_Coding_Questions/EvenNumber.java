package Java8_Coding_Questions;

//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

import java.util.Arrays;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 12, 62, 69, 15, 8, 49, 25, 98, 32);
        list.stream()
                .filter(x -> x % 2 == 0)
                .sorted()
                .forEach(System.out::println);
    }
}