package Collections;

import java.util.ArrayDeque;

public class Program1 {
    public static void main(String[] args) {
        ArrayDeque deque = new ArrayDeque();
        deque.offerFirst(10);
        deque.offerFirst(20);
        deque.offerFirst(30);
        System.out.println(deque.peek());
        deque.poll();
        System.out.println(deque.peekFirst());
        deque.offerLast(100);
        deque.poll();
        System.out.println(deque.peekFirst());

    }
}
