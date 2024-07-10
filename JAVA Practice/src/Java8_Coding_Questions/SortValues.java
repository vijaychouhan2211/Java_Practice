package Java8_Coding_Questions;

//Given a list of integers, sort all the values present in it using Stream functions?

import java.util.Arrays;
import java.util.List;

public class SortValues {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(993,914,157,160,117,138,719,220,210,202);
        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}