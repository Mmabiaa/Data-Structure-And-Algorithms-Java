package data_structures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testPushPop() {
        Stack stack = new Stack(5);
        
        stack.push(10);
        stack.push(20);
        
        assertEquals(20, stack.pop());
        
        assertFalse(stack.isEmpty());
        
        assertEquals(10, stack.pop());
        
        assertTrue(stack.isEmpty());
        
        assertThrows(EmptyStackException.class, () -> stack.pop());
    }
}
