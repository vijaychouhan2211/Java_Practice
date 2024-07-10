package Java8_Coding_Questions;

//Write a Java 8 program to sort an array and then convert the sorted array into Stream?

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {
    public static void main(String[] args) {
        Integer[] array = {10, 23, -4, 0, 18};
        List<Integer> list = Arrays.asList(array);

        List<Integer> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}