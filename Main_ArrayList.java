import java.util.*;

public class Main_ArrayList{

//Class method for the ArrayList.



    public static void main(String[] args) {
       // Create an ArrayList to store integers
      ArrayList<Integer> arrayList = new ArrayList<Integer>(List.of(10, 20, 30, 40, 50));

      // Output of elements with ref to their index.
        System.out.println("Element at index 0: " + arrayList.get(0));
        System.out.println("Element at index 2: " + arrayList.get(2));
        System.out.println("Element at index 4: " + arrayList.get(4));

        //Sum of all elements in the arraylist
        int sum = arrayList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of ArrayList elements: " + sum);

        arrayList.set(2, 35);
        System.out.println("Updated element at index 2: " + arrayList.get(2));

        System.out.println("Element in the ArrayList: ");
        for(int number: arrayList){
            System.out.println(number);
        }
    }
}