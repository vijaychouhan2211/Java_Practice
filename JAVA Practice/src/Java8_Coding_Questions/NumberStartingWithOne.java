package Java8_Coding_Questions;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions?

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,11,12,33,45,78,16);
        list.stream()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }
}