package algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortingAlgorithmsTest {

    @Test
    void testBubbleSort() {
        int[] array = {64, 34, 25, 12, 22};
        
        SortingAlgorithms.bubbleSort(array);
        
        assertArrayEquals(new int[]{12, 22, 25, 34, 64}, array);
    }

    @Test
    void testSelectionSort() {
        int[] array = {64, 34, 25, 12, 22};
        
        SortingAlgorithms.selectionSort(array);
        
        assertArrayEquals(new int[]{12, 22, 25, 34, 64}, array);
    }
}
