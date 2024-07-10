package Java8_Coding_Questions;

//Java 8 program to perform cube on list elements and filter numbers greater than 50

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cube_List {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> cubedNumbers = numbers.stream()
                .map(n -> n * n * n)
                .filter(n -> n > 50)
                .collect(Collectors.toList());

        System.out.println("Cubed numbers greater than 50: " + cubedNumbers);
    }
}