package Java8.Generics;

import java.util.*;

public class GenDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(); //Provide Type safety
        list.add("Generic");
//        list.add(123);
//        list.add(13.00);

        System.out.println(list);

        List anotherList = new ArrayList(); //Does not Provide Type safety
        anotherList.add("AnotherList");
        anotherList.add(132);
        anotherList.add(13.00);

        System.out.println(anotherList);
    }
}
