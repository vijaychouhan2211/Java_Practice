package Collection.Map;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;

//TreeMap class implements Map interface similar to HashMap class.
//The main difference between them is that HashMap is an unordered collection while TreeMap is sorted in the ascending order of its keys.
//TreeMap is unsynchronized collection class which means it is not suitable for thread-safe operations until unless synchronized explicitly.

public class DemoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> treeMap = new TreeMap<String, Double>();
        treeMap.put("Zoro", 3434.34);
        treeMap.put("Mukesh", 123.22);
        treeMap.put("Arya", 1378.00);
        treeMap.putIfAbsent("Yagnesh",561.023);
        treeMap.put("Deepak", 99.22);
        treeMap.put("Raju", -19.08);

        Set<Map.Entry<String, Double>> set = treeMap.entrySet();
        Iterator<Map.Entry<String, Double>> i = set.iterator();
        while (i.hasNext()) {
            Map.Entry me = i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
