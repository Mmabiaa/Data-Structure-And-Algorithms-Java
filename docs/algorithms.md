# Algorithms

This document provides a comprehensive overview of algorithms implemented in this repository, including sorting and searching algorithms. Each algorithm is described with its functionality, time complexity, and example usage.

## Sorting Algorithms

Sorting algorithms arrange elements in a specified order (ascending or descending). The following sorting algorithms are implemented:

### Bubble Sort

Bubble Sort is a simple comparison-based sorting algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

#### Time Complexity
- Best Case: O(n) (already sorted)
- Average Case: O(n^2)
- Worst Case: O(n^2)

#### Example Usage
```
int[] array = {64, 34, 25, 12, 22};
SortingAlgorithms.bubbleSort(array);
// Now array is sorted: {12, 22, 25, 34, 64}
```

---

### Selection Sort

Selection Sort divides the input list into two parts: a sorted part and an unsorted part. It repeatedly selects the smallest (or largest) element from the unsorted part and moves it to the sorted part.

#### Time Complexity
- Best Case: O(n^2)
- Average Case: O(n^2)
- Worst Case: O(n^2)

#### Example Usage
```
int[] array = {64, 34, 25, 12, 22};
SortingAlgorithms.selectionSort(array);
// Now array is sorted: {12, 22, 25, 34, 64}
```

---

## Searching Algorithms

Searching algorithms are used to find an element within a data structure. The following searching algorithms are implemented:

### Linear Search

Linear Search sequentially checks each element of the list until a match is found or all elements have been checked.

#### Time Complexity
- Best Case: O(1) (element found at first position)
- Average Case: O(n)
- Worst Case: O(n)

#### Example Usage
```
int index = SearchingAlgorithms.linearSearch(array, target);
// Returns index of target or -1 if not found
```

---

### Binary Search

Binary Search works on sorted arrays. It compares the target value to the middle element of the array; if they are not equal, it eliminates half of the search space.

#### Time Complexity
- Best Case: O(1) (element found at middle)
- Average Case: O(log n)
- Worst Case: O(log n)

#### Example Usage
```
int index = SearchingAlgorithms.binarySearch(sortedArray, target);
// Returns index of target or -1 if not found
```

---

## Conclusion

Understanding these algorithms is crucial for effective problem-solving in computer science. Each algorithm has its own strengths and weaknesses depending on use cases and data characteristics. The implementations provided here serve as foundational examples that can be further optimized or adapted for specific needs.
