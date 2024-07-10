package Java8_Coding_Questions;

//Given a list of integers, find the total number of elements present in the list using Stream functions?

import java.util.Arrays;
import java.util.List;

public class FindTheTotalNumberOfElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,49,25,98,32,33,45,78,16);
        long count = list.stream().count();
        System.out.println(count);

    }
}
