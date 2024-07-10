package Java8_Coding_Questions;

//Write a java 8 program to Concatenate two Streams?

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concatenate_2_Stream {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("hello");
        Stream<String> stream2 = Stream.of(" everyone!!");

        Stream<String> stream1_stream2 = Stream.concat(stream1, stream2);

        System.out.println(stream1_stream2.collect(Collectors.joining()));
//        System.out.println(stream1_stream2.collect(Collectors.toList()));
    }
}