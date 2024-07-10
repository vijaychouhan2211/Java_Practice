package Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

//ArrayDeque class implements the Deque interface. It facilitates us to use the Deque.
//ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.

public class DemoArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.offer(25);
        deque.offer(20);
        deque.offerLast(30);
        deque.offerFirst(40);
        System.out.println("Peek: " + deque.peek());
        System.out.println("Deque: " + deque);
        System.out.println("Poll: " + deque.pollFirst());
        System.out.println("Poll Last: " + deque.pollLast());
        System.out.println(deque);

        Deque<Integer> deque1 = new ArrayDeque<Integer>();
        deque1.offer(25);
        deque1.offer(35);
        System.out.println(deque1);

    }
}
