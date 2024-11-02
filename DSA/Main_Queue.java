import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
/*
            * Queue - FIFO Data Structure. First-In First-Out.
                        A collection design for holding elements prior to processing
                        Linear data structures.

            *Dequeue - Removing queued elements, .poll();
            *Enqueue - Adding queued elements, .offer();
       */
    

public class Main_Queue {

    //Queue_ method.
    public void Queue_(){
    Queue <String> queue = new LinkedList<String>(); // Queue is an interface not a class.

        // Adding queue elements
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        //Removing queue elements
        queue.poll();

        //To see the number of people present in the queue
        System.out.println(queue.size());

        //To see if an element is present in the queue
        System.out.println(queue.contains("Chad"));
}

    //Linked_LIst method
    public void Linked_List(){
        LinkedList<String> linkedList = new LinkedList<String>();
        /*
         As Stack
         linkedList.push("A");
        linkedList.push("C");
        linkedList.push("S");
        linkedList.push("X");
         */

         //As Queue
         linkedList.offer("A");
        linkedList.offer("C");
        linkedList.offer("S");
        linkedList.offer("X");

        //Adding and removing items
        linkedList.add(3,"E");
        linkedList.remove(4);

        linkedList.addFirst("0");//Adding an item to the first
        linkedList.addLast("G");//Adding an item to the last
        String first = linkedList.removeFirst(); //Removing the first item
        String last = linkedList.removeLast();    //Removing the last item.

        //Peek
        System.out.println(linkedList.peekFirst()); // To see first item
        System.out.println(linkedList.peekLast()); //  To see last item

        //Output of new stack.
        System.err.println(linkedList);
    }

    //Priority_Queue method.
    public void Priority_Queue(){//Higher priority are served first before lower ones.
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("D");
        queue.offer("F");

        //output

        while(!(queue.isEmpty())){
            System.out.println(queue.poll());
        }
    }
    public static void main(String[] args) {
       Main_Queue q = new Main_Queue();
       q.Linked_List();
        //q.Priority_Queue();
    }
}
