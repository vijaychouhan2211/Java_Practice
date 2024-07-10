package Java8_Coding_Questions;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,49,25,98,32,33,45,78,16);
        int max = list.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);
    }
}
