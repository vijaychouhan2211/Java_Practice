package Java8_Coding_Questions;

//How to use map to convert object into Uppercase in Java 8?

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Uppercase_map_obj {
    public static void main(String[] args) {
        List<String> obj = Arrays.asList("Vijay", "Navin", "Dev");
        List<String> name = obj.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(name);
    }
}
