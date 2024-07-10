package Java8_Coding_Questions;

//Given the list of integers, find the first element of the list using Stream functions?

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,2);
        list.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
