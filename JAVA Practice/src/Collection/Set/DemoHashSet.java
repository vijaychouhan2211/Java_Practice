package Collection.Set;

import java.util.HashSet;

//In HashSet Duplicate objects are not allowed.
//Insertion order is not preserved.

public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<Integer>();
        hashset.add(15);
        hashset.add(1);
        hashset.add(1);
        hashset.add(1);
        hashset.add(12);
        hashset.add(10);
        hashset.add(10);
        hashset.add(2);
        hashset.add(3);
        hashset.add(5);
        hashset.add(5);
        hashset.add(9);
        hashset.add(9);
        hashset.add(02);
        hashset.add(6);
        hashset.add(0);
        System.out.println(hashset);

        int a[]={15,1,1,1,12,10,10,2,3,5,5,5,6,6,9,9,9,0,02};
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
            hs.add(a[i]);
        for(int i:hs)
            System.out.print(i + ", ");
    }
}