package Java8_Coding_Questions;

//Given a String, find the first repeated character in it using Stream functions?

import java.util.Map;
import java.util.stream.Collectors;

public class FirstRepeat {
    public static void main(String[] args) {
        String str = "Java";

        // Use Collectors.groupingBy to count occurrences of each character
        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // Find the first character with more than one occurrence
        Character firstRepeatedChar = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println("First repeated character: " + firstRepeatedChar);
    }
}
