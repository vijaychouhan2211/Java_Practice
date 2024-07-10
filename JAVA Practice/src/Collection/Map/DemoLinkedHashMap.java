package Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//1. It used to hold key value pairs
//2. Underlying data Structure is HashTable & LinkedList.
//3. Duplicate keys are not allowed but values can be duplicated.
//4. Insertion order is preserved.

public class DemoLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(4, "Four");
        linkedHashMap.put(5, "Five");

        System.out.println(linkedHashMap);
        System.out.println("Before Remove(): " + linkedHashMap);
        linkedHashMap.remove(2);
        System.out.println("After Remove(): " + linkedHashMap);


        Set<Map.Entry<Integer, String>> entrySet = linkedHashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}