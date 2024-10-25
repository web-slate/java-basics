# Data Structures in Java
- A data structure is a way to store and organize  data.
- Data structures give us the possibility to manage large amounts of data efficiently for uses such as large databases and internet indexing services

## Two different type of DataStructure
**Primitive Data Structures** are basic data structures provided by programming languages to represent single values, such as integers, floating-point numbers, characters, and booleans.

**Abstract Data Structures** are higher-level data structures that are built using primitive data types and provide more complex and specialized operations. Some common examples of abstract data structures include arrays, linked lists, stacks, queues, trees, and graphs.

### Basic Data Structures to Learn
- Arrays
- Linked List
- Stack
- Queue
- HashMap/HashTable
- Trees (Binary Tree, Binary Search Tree)
- Graphs

#### Arrays
An Array is a fixed-size data structure that holds elements of the same type in a contiguous memory location.

```java
int[] arr = new int[5]; // Declare an array of integers
arr[0] = 10;            // Assign a value
```
#### Linked List
A Linked List is a linear data structure where each element is a separate object called a "node". Each node contains the data and a reference to the next node.

##### Types of Linked Lists:
- Singly Linked List: Each node points to the next node.
- Doubly Linked List: Each node points to both the next and previous nodes
- Circular Linked List
- Doubly Circular Linked List

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}
```

#### Stack
A Stack is a LIFO (Last In First Out) data structure. The last element added is the first to be removed.

```java
import java.util.Stack;

Stack<Integer> stack = new Stack<>();
stack.push(10);  // Push element onto stack
stack.pop();     // Pop element from stack

```

#### Queue
A Queue is a FIFO (First In First Out) data structure. The first element added is the first to be removed.

```java
import java.util.LinkedList;
import java.util.Queue;

Queue<Integer> queue = new LinkedList<>();
queue.add(10);    // Enqueue element
queue.remove();   // Dequeue element
```

#### HashMap
A HashMap is a collection that stores data in key-value pairs. It uses hashing to provide constant time complexity for basic operations like get and put.

```java
import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<>();
map.put("Apple", 1);  // Insert key-value pair
map.get("Apple");     // Retrieve value

```
#### Trees
A Tree is a hierarchical data structure where each node has a value and children. The most common type of tree is a Binary Tree, where each node has at most two children.

**Types of Trees:**
- Binary Search Tree (BST): A binary tree where the left child is smaller than the parent node, and the right child is larger.
- AVL Tree: A self-balancing binary search tree.

#### Graphs
A Graph is a collection of nodes (called vertices) and edges connecting pairs of nodes. Graphs can be directed or undirected.