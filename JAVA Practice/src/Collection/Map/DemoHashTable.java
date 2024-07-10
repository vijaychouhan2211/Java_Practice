package Collection.Map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

//1. It used to hold key value pairs
//2. Duplicate keys are not allowed but values can be duplicated.
//3. Insertion order is preserved.
//4. Null is allowed for key (only once)and allows for values any number of times.
//5. HashTable is synchronized.

public class DemoHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
        ht.put("Din", 19);
        ht.put("John", 20);
        ht.put("David", 22);
        ht.put("Rick", 23);
        ht.put("Ronald", 24);
        System.out.println("\n" + ht);

        //Iterator for Keys
        Iterator it = ht.entrySet().iterator();
        System.out.println("\nKeys");
        while(it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey());
        }
        //Iterator for values
        Iterator<String> it1 = ht.keySet().iterator();
        System.out.println("\nValues");
        while (it1.hasNext()) {
            String key = it1.next();
            System.out.println(ht.get(key));
        }

        Iterator<Map.Entry<String, Integer>> it2 = ht.entrySet().iterator();
        System.out.println("\nKeys and values");
        while (it2.hasNext()) {
            Map.Entry<String, Integer> entry = it2.next();
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }
}