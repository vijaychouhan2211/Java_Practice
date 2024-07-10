package Collection.Set;

import java.util.TreeSet;

//It is a child class of SortedSet.
//The underlying data Structure is BalancedTree.
//Insertion order is not preserved it is based some sorting order.
//Heterogeneous data is not allowed.
//Duplicate objects are not allowed.
//Null insertion is possible only once.

public class DemoTreeSet {
    public static void main (String[] args) {
        TreeSet<Integer> treeset = new TreeSet<Integer>();
        treeset.add(12);
        treeset.add(0);
        treeset.add(9);
        treeset.add(9);
        treeset.add(11);
        treeset.add(13);
        treeset.add(13);
        treeset.add(150);
        treeset.add(6);
        treeset.add(6);
        treeset.add(8);
        treeset.add(9);

        System.out.println(treeset);

        int a[] = {12,1,4,5,6,3,3,3,3,3,4,4,4,4,0,5,5,5,5,12,1,2,12,150};
        for (int i = 0; i < a.length; i++)
            treeset.add(a[i]);
        for(int i:treeset)
            System.out.print(i + " ");
    }
}
