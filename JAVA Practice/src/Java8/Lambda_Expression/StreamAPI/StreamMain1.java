package Java8.Lambda_Expression.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {

        //Create a List and Filter all the even number form the list

        List<Integer> list1 = List.of(12, 5, 69, 17, 88, 19, 10);
//        System.out.println("List1 "+ list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(45);
        list2.add(78);
        list2.add(11);
        list2.add(5);
        list2.add(28);
        list2.add(27);
//        System.out.println("List2 " + list2);

        List<Integer> list3 = Arrays.asList(1, 45, 63, 47, 58, 12, 10);
//        System.out.println("List3 " + list3);

//        //list1
        //without stream
        List<Integer> listeven = new ArrayList<>();
        for(Integer i : list1) {
            if(i % 2 == 0) {
                listeven.add(i);
            }
        }
        System.out.println("List1 " + list1);
        System.out.println(listeven);

//        //using stream
        Stream<Integer> stream = list2.stream();
        List<Integer>newlist = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("List2 " + list2);
        System.out.println(newlist);

        List<Integer> newlist1 = list3.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("List3 " + list3);
        System.out.println(newlist1);
    }
}
