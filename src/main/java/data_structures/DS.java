package src.main.java.data_structures;
import java.util.*;

public class DS {
    //Array
    void Array_(){
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Element at index 0: " + array[0]);
        System.out.println("Element at index 2: " + array[2]);
        System.out.println("Element at index 4: " + array[4]);

        //Sum of elements.
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum =+ array[i];
        }
        System.out.println("Sum of elements: " + sum);

        //Updating index 2
        array[2] = 35;
        System.out.println("Updated element at index 2: "+array[2]);

        System.out.println("Element in the Array: ");
        for(int e : array){
            System.out.println(e);
        }
    }

    //ArrayList
    void ArrayList_(){
        ArrayList <Integer> arrayList = new ArrayList<Integer>(List.of(10, 20, 30 ,40, 50));

        System.out.println("Element at index 0:  "+arrayList.get(0));
        System.out.println("Element at index 2:  "+arrayList.get(2));
        System.out.println("Element at index 4:  "+arrayList.get(4));

        //Sum of all elements in the arrayList
        int sum = arrayList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of ArrayList elements: "+sum);

        //Updating element at index 2.
        int two = arrayList.set(2, 35);
        System.out.println("Updated element at index 2: "+two);

        //Printing all ArrayList elements
        System.out.println("Element in arrayList: ");
        for(int e: arrayList){
            System.out.println(e);
        }
    }

    void LinkedList_(){
        LinkedList <Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        System.out.println("LinkedList:"+linkedList);

        //Removing first element
        linkedList.removeFirst();
        System.out.println("LinkedList after removing first element:"+linkedList);

        //Contains
        boolean contain = linkedList.contains(30);
        System.out.println("LinkedList contains element '30'? " + contain);

        int first = linkedList.getFirst();
        int last = linkedList.getLast();
        System.out.println("First element: "+first);
        System.out.println("Last element: "+last);

        //clearing the linked list.
        linkedList.clear();
        System.out.println("LinkedList after clearing: "+linkedList);
    }

    void Stack_(){
        Stack <Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        //Peek() and pop()
        System.out.println("Top element: "+ stack.peek());
        System.out.println("Popped element: "+ stack.pop());
        System.out.println("Is stack empty: "+ stack.isEmpty());
        System.out.println("Stack size: "+ stack.size());
        //printing stack elements.
        System.out.println("Stack elements:");
        for(int e:stack){
            System.out.println(e);
        }
    }

    void Queue_(){
        Queue <Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Front element " + queue.peek());

        //Dequeuing
        while(!queue.isEmpty()){
            int e = queue.poll();
            System.out.println("Dequeue element"+e);
        }
    }

    void HashMap_(){
        HashMap <String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob",20);

        System.out.println("Age of John: " + hashMap.get("John"));
        System.out.println("Age ofAlice: " + hashMap.get("Alice"));

        System.out.println("Is Bob present? "+ hashMap.containsKey("Bob"));

        for(String key: hashMap.keySet()){
            System.out.println(key+ ":"+ hashMap.get(key));
        }

        System.out.println("Size of the HashMap: " + hashMap.size());
    }


    //Main Function
    public static void main(String[] args) {
        DS h = new DS();
        h.Array_();
        System.out.println();
        h.ArrayList_();
        System.out.println();
        h.HashMap_();
        System.out.println();
        h.Queue_();
        System.out.println();
        h.LinkedList_();
    }
}
