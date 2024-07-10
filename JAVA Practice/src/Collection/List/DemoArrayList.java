package Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// ArrayList supports dynamic array that can grow as needed.
//Duplicate objects are allowed
//Null insertion is possible
//Heterogeneous objects are allowed
//The under laying data structure is double linked list.
//Insertion order is preserved
//** class ArrayList extends AbstractList implements List

public class DemoArrayList {
    public static void main(String[] args) {

        System.out.println("-------------------------Normal ArrayList-------------------------");
        ArrayList list1 = new ArrayList();
        //ArrayList list1 = new ArrayList();
        //add the elements
        list1.add(2);
        list1.add(50);
        list1.add(1,30);
        list1.add(15);
        list1.add("Raj");
        list1.add(" ");
        System.out.println(list1);
        //Remove the element at index value
        list1.remove(0);
        System.out.println(list1);
        System.out.println(list1.get(3));
        System.out.println(list1.size());
        //clear the Array List
        list1.clear();
        System.out.println("List is Clear: " + list1);

        //ArrayList with generics
        System.out.println("-------------------------ArrayList with Generics-------------------------");
        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(50);
        list2.add(20);
        list2.add(1,40);
        //Add At First (0) Index
        list2.addFirst(69);
        //Add At Last (n-1) Index
        list2.addLast(98);
        System.out.println(list2);
        //Write boolean and the element contains or not
        System.out.println(list2.contains(69));
        System.out.println(list2.removeLast());
        System.out.println(list2.getFirst());
        System.out.println(list2.getLast());
        System.out.println(list2.clone());
        System.out.println("Sum of two list element :" + list2.get(0) + list2.get(1));

        List<String> list3 = Arrays.asList("A", "B", "C");
        List<String> list4 = Arrays.asList("A", "B", "C");
        System.out.println("-------------------------Comparison the list-------------------------");
        System.out.println(list3 + "  " + list4);
        System.out.println("Both the list are same: " + list3.equals(list4)); // Output: true or false

        //Iterator interface provides the facility of iterating the elements in a forward direction only.
        System.out.println("-------------------------Traversing list through Iterator-------------------------");
        ArrayList<String> arraylist=new ArrayList();//Creating arraylist
        arraylist.add("Ravi");//Adding object in arraylist
        arraylist.add("Vijay");
        arraylist.add("Ajay");
        System.out.println(arraylist);
        //Traversing list through Iterator
        Iterator itr=arraylist.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
