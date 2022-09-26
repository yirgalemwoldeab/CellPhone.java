package day_46_collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {

        ArrayDeque<String>   deque=new ArrayDeque<>();
        deque.offer("java");
        deque.offer("tuesday");
        deque.offer("softskill");
        deque.offer("automation");
        System.out.println(deque);
        System.out.println(deque.peek());

        System.out.println(deque.poll());
        System.out.println(deque);
        System.out.println(deque.peek());

        deque.offerFirst("API");
        System.out.println(deque);
       // deque.add(null);not allowed

        deque.pollLast();
        System.out.println(deque);

        LinkedList<Integer> list=new LinkedList<>();





    }
}
