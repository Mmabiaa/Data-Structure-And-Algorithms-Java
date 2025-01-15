package algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SearchingAlgorithmsTest {

    @Test
    void testLinearSearch() {
        int[] array = {5, 3, 8, 6};
        
        assertEquals(2, SearchingAlgorithms.linearSearch(array, 8));
        
         assertEquals(-1, SearchingAlgorithms.linearSearch(array, 10));
     }

     @Test
     void testBinarySearch() {
         int[] sortedArray = {1, 2, 3, 4, 5};
         
         assertEquals(2, SearchingAlgorithms.binarySearch(sortedArray, 3));
         
         assertEquals(-1, SearchingAlgorithms.binarySearch(sortedArray, 10));
     }
}
