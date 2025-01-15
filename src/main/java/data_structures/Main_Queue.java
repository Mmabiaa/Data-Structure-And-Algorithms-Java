package src.main.java.data_structures;
import java.util.*;

public class Main_Queue {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<Integer>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        //Print first element
        int first = queue.peek();
        System.out.println("Front element: " + first);
        
        //Dequeuing the elements.
        while(!queue.isEmpty()) {
            int e = queue.poll();
            System.out.println("Dequeue element: " + e);
        }
    }
}
