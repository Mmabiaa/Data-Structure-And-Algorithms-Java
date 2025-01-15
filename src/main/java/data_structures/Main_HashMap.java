package src.main.java.data_structures;
import java.util.*;

public class Main_HashMap {
    public static void main(String[] args) {
        HashMap <String, Integer> hashMap = new HashMap<>();
        //Adding keys to a hash map.
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 35);

        //Displaying the integer values.
        int alice = hashMap.get("Alice");
        int john = hashMap.get("John");
        System.out.println("Age of John: " + john);
        System.err.println("Age of Alice: " + alice);

        //Checking if a key is present.
        Boolean isPresent = hashMap.containsKey("Bob");
        System.out.println("Is Bob present? " + isPresent);

        //Printing all key-value pairs.
        for(String key: hashMap.keySet()){
            System.out.println(key+":"+hashMap.get(key));
        }

        //Size of the hash map
        int Size = hashMap.size();
        System.out.println("Size of the hash map: "+Size);
    }
}
