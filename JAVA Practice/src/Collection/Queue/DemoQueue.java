package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;
//Queue interface maintains the first-in-first-out order.
// It can be defined as an ordered list that is used to hold the elements which are about to be processed.
// There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.

public class DemoQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(25); //offer is used to add the elements in queue
        queue.offer(34);
        queue.offer(56);
        queue.offer(78);
        System.out.println("Queue: " + queue);
        System.out.println("Q remove: " + queue.poll()); // remove element
        System.out.println("Q peek: " + queue.peek());
        System.out.println("Q poll: " + queue.poll());
        System.out.println("Queue: " + queue);

    }
}
