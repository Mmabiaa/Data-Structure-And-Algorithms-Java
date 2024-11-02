import java.util.*;

public class Main_ArrayList{

//Class method for the ArrayList.



    public static void main(String[] args) {
       //ArrayList variable.
       ArrayList <Integer> array = new ArrayList<>(List.of(10, 20, 30, 40, 50));

       //Listing elements at index
       System.out.println("Elements at index 0:" + array.get(0));
       System.out.println("Elements at index 2:" + array.get(20));
       System.out.println("Elements at index 4:" + array.get(4));

        int Sum = array.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of the ArrayList elements:" + Sum);

        array.set(2, 35);
        System.out.println("Updated elements at index 2:" + array.get(2));

        System.out.println("Elements in the ArrayList: ");
        for(int element: array){
            System.out.println(element);
        }
    }
}