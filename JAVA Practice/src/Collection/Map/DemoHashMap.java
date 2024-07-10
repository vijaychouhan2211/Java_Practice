package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;

//1. It used to hold key value pairs
//2. Underlying data Structure is HashTable.
//3. Duplicate keys are not allowed but values can be duplicated.
//4. Insertion order is not preserved.
//5. Null is allowed for key (only once)and allows for values any number of times.
//6. Every method is non-synchronized so multiple Threads are operate at a time hence permanence is high

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> name = new HashMap<String, Integer>();

        name.put("Arun", 20);
        name.put("David", 20);
        name.put("Harry", 36);
        name.put("Michael", 35);
        name.put("Paul", 18);
        name.put("Peter", 19);
        name.put("Ryan", 29);
        name.put("Robert", 39);
        name.put("Sarah", 28);
        name.put("David", 30);


        System.out.println("Paul: " + name.get("Paul"));
        int a = name.hashCode();
        System.out.println("HashCode " + a);
        System.out.println(name.entrySet());

    }
}