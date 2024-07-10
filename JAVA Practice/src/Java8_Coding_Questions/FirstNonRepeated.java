package Java8_Coding_Questions;

//Given a String, find the first non-repeated character in it using Stream functions?

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String str = "Java";

        // Use Collectors.toMap to count occurrences of each character
        char result = IntStream.range(0, str.length())
                .mapToObj(str::charAt)
                .collect(Collectors.toMap(
                        c -> c,        // Key is the character itself
                        c -> 1,        // Initial count for each character is 1
                        (existing, replacement) -> existing + 1  // Merge function: increment count
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('#');   // Default value if no non-repeated character is found

        System.out.println("Non-repeated character is " + result);
    }
}