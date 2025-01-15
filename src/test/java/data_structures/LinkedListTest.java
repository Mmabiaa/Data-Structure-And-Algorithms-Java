package src.test.java.data_structures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void testAddAndPrint() {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        
        // Capture output from printList method here if needed.
        
        // Assertions can go here based on expected output.
        
        // For demonstration purposes:
        assertEquals(10, list.head.data);
    }
}