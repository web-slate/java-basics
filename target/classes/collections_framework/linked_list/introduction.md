# Linked List
- The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
- LinkedList stores its items in "containers."

## LinkedList Methods in Java

In many cases, `ArrayList` is more efficient for accessing random items in the list. However, `LinkedList` provides several methods for efficient operations, especially when adding or removing elements at the beginning or end of the list.

### Method Descriptions and Examples

| Method         | Description                              
|----------------|------------------------------------------|
| `addFirst()`   | Adds an item to the beginning of the list |
| `addLast()`    | Adds an item to the end of the list       |
| `removeFirst()`| Removes an item from the beginning of the list | 
| `removeLast()` | Removes an item from the end of the list | 
| `getFirst()`   | Gets the item at the beginning of the list |
| `getLast()`    | Gets the item at the end of the list     |

### Example Usage

```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // addFirst() example
        list.addFirst("Apple");
        System.out.println(list); 

        // addLast() example
        list.addLast("Banana");
        System.out.println(list); 

        // removeFirst() example
        list.removeFirst();
        System.out.println(list); 

        // removeLast() example
        list.addFirst("Apple");
        list.removeLast();
        System.out.println(list);

        // getFirst() example
        System.out.println(list.getFirst()); 

        // getLast() example
        list.addLast("Banana");
        System.out.println(list.getLast());
    }
}
```