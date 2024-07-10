package Collection.List;

import java.util.Iterator;
import java.util.LinkedList;

//Duplicate objects are allowed
//Null insertion is possible
//Heterogeneous objects are allowed
//The under laying data structure is double linked list.
//Insertion order is preserved
//** Class LinkedList extends AbstractSequentialList implements List,Deque,Queue

public class DemoLinkedList {
    public static void main(String[] args) {
        System.out.println("-------------------------LinkedList-------------------------");
        LinkedList<String> name = new LinkedList<String>();
        name.add("Om");
        name.add("Sam");
        name.addFirst("Dev");
        name.add(1, "Raju");
        name.addLast("Vikram");
        name.removeFirst();
        name.removeLast();
        name.addLast("Karan");

        Iterator<String> it = name.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
