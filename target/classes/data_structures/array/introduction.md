# Array

## Fixed Size Array - Time Complexity Table

```
int[] fixedArray = new int[5];  // Fixed-Size Array Example declares an array of size 5 (0 to 4)

fixedArray[0] = 10; // Adding elements
fixedArray[1] = 20;
fixedArray[2] = 30;
fixedArray[3] = 40;
fixedArray[4] = 50;
```

1. Accessing is faster in Arrays but searching, adding or removing will be "N" because it works through index.

| Operation       | Array  |
|-----------------|--------|
| Access          | O(1)   |
| Search          | O(n)   |
| Insert          | O(n)   |
| Delete          | O(n)   |

1. Java offers additional data structures in the java.util package that behave similarly to arrays

## Dynamic Size Array - Time Complexity Table

1. Default initial capacity: 10
1. Why insertion is faster in Dynamic size arrays with `O(1)`, its due to Amortized.
1. ArrayList typically has constant time O(1) but resizing operation is costly, taking linear time O(n).
1. Resizing does not happen every time an element is added so amortized time complexity for adding elements to ArrayList is O(1).
1. Let say initial array size is 4 and when array is full (e.g., at capacity of 4), a resize operation occurs:
    1. Double the capacity (e.g., from 4 to 8).
    1. Copy existing elements, taking O(n) time.
    1. 

| Operation       | Time Complexity             |
|-----------------|-----------------------------|
| Access          | O(1)                    |
| Search          | O(n)                    |
| Insert (end)    | Amortized O(1)          |
| Insert (middle) | O(n)                    |
| Delete (end)    | O(1)                    |
| Delete (middle) | O(n)                    |

```
import java.util.ArrayList;

ArrayList<Integer> dynamicArray = new ArrayList<>(); // Dynamic Array Example
ArrayList<Integer> dynamicArray2 = new ArrayList<>(20); // Specify an initial capacity of 20 but default is 10

dynamicArray.add(10); // Adding elements
dynamicArray.add(20);
dynamicArray.add(30);

dynamicArray.set(1, 25); // Modifying elements
 
dynamicArray.remove(0); // Removes the element at index 0
```

> Similar to array is below but this will be explained in detail in other data sturcture section.

```
import java.util.LinkedList;
import java.util.Vector; // similar to ArrayList but is synchronized, making it thread-safe.
import java.util.Stack; // follows Last-In-First-Out (LIFO) order and is also thread-safe since it extends Vector.
```
