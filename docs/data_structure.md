# Data Structures

This document provides a comprehensive overview of the data structures implemented in this repository, including their functionalities, complexities, and usage examples.

## Linked List

A **Linked List** is a linear data structure where elements are stored in nodes, each containing a reference (or link) to the next node in the sequence. This allows for efficient insertion and deletion of elements.

### Structure

Each node in a linked list contains:
- **Data**: The value stored in the node.
- **Next**: A reference to the next node in the list.

### Operations

- **Add**: Inserts an element at the end of the list.
- **Print**: Displays all elements in the list.
- **Delete**: Removes an element from the list (not implemented yet).

### Time Complexity

- **Add**: O(n) for traversing to the end of the list.
- **Print**: O(n) for traversing the entire list.

### Example Usage

LinkedList list = new LinkedList();
list.add(10);
list.add(20);
list.printList(); // Output: 10 20
text

---

## Stack

A **Stack** is a linear data structure that follows the Last In First Out (LIFO) principle. Elements are added and removed from one end, known as the "top" of the stack.

### Operations

- **Push**: Adds an element to the top of the stack.
- **Pop**: Removes and returns the top element from the stack.
- **Peek**: Returns the top element without removing it.
- **IsEmpty**: Checks if the stack is empty.

### Time Complexity

- **Push**: O(1)
- **Pop**: O(1)
- **Peek**: O(1)

### Example Usage

Stack stack = new Stack(5);
stack.push(10);
stack.push(20);
System.out.println(stack.pop()); // Output: 20
System.out.println(stack.isEmpty()); // Output: false
text

---

## Conclusion

These data structures provide fundamental building blocks for more complex data handling and algorithms. Their implementations can be expanded with additional features such as deletion methods or resizing capabilities as needed.
