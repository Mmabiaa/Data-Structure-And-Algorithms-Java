package src.main.java.data_structures;
import java.util.*;

public class Main_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        
        //Adding stack elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        //Viewing the top elements of a STack.
        int top = stack.peek();
        System.out.println("Top element: " + top);
        System.out.println("Popped element: " + stack.pop());

        //Checking if stack is empty.
        boolean isEmpty = stack.empty();
        System.out.println("Is stack empty: " + isEmpty);

        //Checking the size
        int Size = stack.size();
        System.out.println("Stack size: " +Size);
        //Printing stack elements.
        System.out.println("Stack Elements:");
        for(int e : stack)
        System.out.println(e); 
    }
}
