package Collection.Queue;

import java.util.concurrent.ConcurrentLinkedQueue;

//ConcurrentLinkedQueue is a part of the Java Collection Framework and belongs to the java.util.concurrent package.
//It is an unbounded thread-safe implementation of a queue that inserts elements at the tail of the queue in a FIFO fashion.
// This means that the head of the queue will always be the oldest element added to the queue.

public class DemoConcurrentLinkedQueue {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        // Add elements to the queue
        queue.add(12);
        queue.add(70);
        queue.add(1009);
        queue.add(475);

        // Retrieve elements from the queue
        System.out.println("ConcurrentLinkedQueue: " + queue);
        System.out.println("First Element is: " + queue.peek());
        System.out.println("Head Element is: " + queue.element());
        System.out.println("Last Element is: " + queue.peek());
        System.out.println("Poll element is: " + queue.poll());

        // Remove elements from the queue
        System.out.println("ConcurrentLinkedQueue after removing elements: " + queue);

    }
}
