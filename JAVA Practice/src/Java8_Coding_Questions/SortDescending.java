package Java8_Coding_Questions;

//sort all the values present in list in descending order using Stream functions?

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDescending {
    public static void main (String[] args) {
        List<Integer> list = Arrays.asList(993,914,157,160,117,138,719,220,210,202);
        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
