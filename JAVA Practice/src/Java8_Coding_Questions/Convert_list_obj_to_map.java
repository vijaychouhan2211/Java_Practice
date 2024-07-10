package Java8_Coding_Questions;

//How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class Convert_list_obj_to_map {
        public static void main(String[] args) {
                List<String> list = Arrays.asList("Sheetal", "Tanuj", "Vedya", "Ruhaan", "Tanuj", "Sheetal");
                Map<String, Long> map = list.stream()
                        .sorted((s1, s2) -> s1.compareTo(s2))
                        .collect(Collectors.groupingBy
                                (Function.identity(),
                                        LinkedHashMap::new,
                                        Collectors.counting()));

                map.entrySet()
                        .stream()
                        .forEach(entry ->
                                System.out.println(entry.getKey() + " " + entry.getValue()));
        }
}