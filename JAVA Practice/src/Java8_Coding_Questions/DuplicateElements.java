package Java8_Coding_Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45,58,58,69,45,6,4,85,69);
        Set<Integer> set = new HashSet();
        list.stream()
                .filter( n -> !set.add(n))
                .forEach(System.out::println);
    }
}
