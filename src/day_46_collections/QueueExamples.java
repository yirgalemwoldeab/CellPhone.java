package day_46_collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {

        Queue<Integer>  queue=new PriorityQueue<>();
        queue.add(3);
        queue.add(10);
        queue.add(2);
        queue.add(8);
        System.out.println(queue);//it is random order
        System.out.println(queue.peek());//since it is random order 2 is on the top that is why peek is 2
        System.out.println(queue.poll());//poll is removing

        System.out.println(queue);


    }
}
