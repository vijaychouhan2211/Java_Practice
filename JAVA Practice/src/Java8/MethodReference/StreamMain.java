package Java8.MethodReference;

import java.util.ArrayList;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {

        List<Integer> list = List.of(1254, 12489, 45, 1, 1126);
        System.out.println(list);

        list.forEach(System.out::println);
    }
}
