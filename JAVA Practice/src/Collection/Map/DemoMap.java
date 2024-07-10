package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Map is a child interface of collection.
//Up to know we are working with single object and single value whereas in the map collections we are working with two objects and two elements.
//The main purpose of the collection is to compare the key value pairs and to perform necessary operation.
//The key and value pairs we can call it as map Entry.
//Both keys and values are objects only.
//In entire collection keys can’t be duplicated but values can be duplicate

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Rakesh", 18);
        map.put("Prem", 15);
        map.put("Zakir", 25);
        map.put("Raj", 20);
        map.put("Dev", 19);
        map.put("Rakesh", 21);
        map.put("Prem", 22);

        System.out.println(map);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
