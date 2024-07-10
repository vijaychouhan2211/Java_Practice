package Collection.Set;

import java.util.LinkedHashSet;

//Duplicate objects are not allowed.
//It is a child class of HashSet.
//Insertion order is preserved
//The under laying data structure is linkedList & hashTable.

public class DemoLinkedHashSet {
    public static void main (String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);

        System.out.println(linkedHashSet);
        int a[]={15,1,1,1,12,10,10,2,3,5,5,5,6,6,9,9,9,0,02};
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        for(int i=0;i<a.length;i++)
            lhs.add(a[i]);
        for(int i:lhs)
            System.out.print(i + " ");
    }
}
