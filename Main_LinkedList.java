import java.util.*;

public class Main_LinkedList {
    public static void main(String[] args) {
        //LinkedList.
        LinkedList <Integer> linkedList = new LinkedList<>();
       //Adding elements to linkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        System.out.println("LinkedList:"+ linkedList);

        //Removing first element.
        linkedList.removeFirst();
        System.out.println("LinkedList after removing first element:"+linkedList);

        //Checking if an element is in the linked list.
        Boolean Check = linkedList.contains(30);
        System.out.println("LinkedList contains element '30'? " + Check);

        int first = linkedList.getFirst();
        int last = linkedList.getLast();

        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);

        // Clearing the linked list elements
        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);

    }
}
