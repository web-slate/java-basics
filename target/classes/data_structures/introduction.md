# Data Structures in Java
- A data structure is a way to store and organize  data.
- Data structures give us the possibility to manage large amounts of data efficiently for uses such as large databases and internet indexing services
- There are two types of data structures and they are linear and non-linear.

## Linear Data Structures

### Simple Info.

| Data Structure | Types                      | Operation Types               | Real-time Examples                            |
|----------------|----------------------------|--------------------------------|-----------------------------------------------|
| Array          | Fixed-size, Dynamic Array  | Access, Insert, Delete        | Days in a week; Temperature readings          |
| Linked List    | Single, Doubly, Circular   | Access, Insert, Delete        | Music playlist; Treasure hunt clues           |
| Stack          | Array-based, Linked List   | Push, Pop, Peek               | Browser history; Undo functionality           |
| Queue          | Simple, Circular, Priority | Enqueue, Dequeue, Peek        | Bank line; Call center queue                  |

### Detailed

| **Data Structure** | **Optimized Implementation in Java** | **Operations** | **Real-time Example** |
|-------------------|-------------------------------------|----------------|-----------------------|
| **Array**         | `int[] arr = new int[5];` <br> `Integer[] arr = new Integer[5];` <br> (Use primitives over wrapper classes for better performance) | Access, Update, Search | Storing a fixed number of student grades |
| **Linked List**   | `List<Integer> list = new LinkedList<>();` (Consider using `ArrayList` for better random access performance) | Insert, Delete, Traverse | Implementing a playlist where songs can be added or removed dynamically |
| **Stack**         | `Deque<Integer> stack = new ArrayDeque<>();` (Use `ArrayDeque` instead of `Stack` for better performance) | Push, Pop, Peek | Undo functionality in text editors |
| **Queue**         | `Deque<Integer> queue = new ArrayDeque<>();` (Using `ArrayDeque` is generally more efficient than `LinkedList`) | Enqueue, Dequeue, Peek | Print job scheduling in printers |



## Non-linear Data Structures

### Simple Info.

| Data Structure | Types                        | Operation Types               | Real-time Examples                            |
|----------------|------------------------------|--------------------------------|-----------------------------------------------|
| Tree           | Binary, AVL, Red-Black       | Insert, Delete, Traversal     | Org charts; Family tree                       |
| Graph          | Directed, Undirected         | Add/Remove Vertex/Edge, Search| Road network; Social networks                 |
| Heap           | Min, Max, Fibonacci          | Insert, Delete, Find Max/Min  | Task scheduling; Top elements selection       |
| Hash Table     | Chaining, Open Addressing    | Insert, Delete, Access        | Book indexing; User data lookup               |
| Set            | HashSet, TreeSet             | Add, Remove, Contains         | Unique tags; Removing duplicates              |
| Trie           | Basic, Radix, Suffix         | Insert, Search, Delete        | Autocomplete; Spell checking                  |

### Detailed

| **Data Structure** | **Optimized Implementation in Java** | **Operations** | **Real-time Example** |
|-------------------|-------------------------------------|----------------|-----------------------|
| **Tree**          | `class TreeNode { int val; TreeNode left, right; }` <br> `TreeNode root = new TreeNode();` (Ensure balanced trees for optimal performance) | Insert, Delete, Traverse (In-order, Pre-order, Post-order) | File system hierarchy |
| **Graph**         | `Map<Integer, List<Integer>> graph = new HashMap<>();` <br> `List<List<Integer>> graph = new ArrayList<>();` (Use appropriate collections based on access patterns) | Add Edge, Remove Edge, Traverse (DFS/BFS) | Social network connections |
| **Heap**          | `PriorityQueue<Integer> minHeap = new PriorityQueue<>();` <br> `PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());` (Choose the right heap implementation based on use case) | Insert, Remove Min/Max, Peek Min/Max | Task scheduling based on priority |
| **Hash Map**      | `Map<String, Integer> map = new HashMap<>();` <br> `Map<String, Integer> map = new LinkedHashMap<>();` (Use hashing efficiently to minimize collisions) | Insert, Delete, Lookup | Caching user sessions in web applications |
| **Set**           | `Set<Integer> set = new HashSet<>();` <br> `TreeSet<Integer> set = new TreeSet<>();` (Choose the right set type based on order requirements) | Add, Remove, Check Membership | Storing unique user IDs in a system |
| **Trie**          | `class TrieNode { TrieNode[] children = new TrieNode[26]; boolean isEnd; }` <br> `TrieNode root = new TrieNode();` (Optimize for space and access time by limiting character set size) | Insert, Search, Delete | Autocomplete feature in search engines |

### General Optimization Tips
- Prefer using primitive types over their wrapper classes to reduce memory overhead.
- Minimize object creation and reuse objects whenever possible to reduce garbage collection overhead.
- Use efficient data structures based on the specific needs of your application, such as choosing `ArrayList` for random access and `LinkedList` for frequent insertions and deletions.
- Profile your application to identify bottlenecks and optimize those specific areas using tools like JProfiler or VisualVM.

## Various Data Structure in Java

| Standard Data Structure | Implementation Note or Java Equivalent                |
|-------------------------|-------------------------------------------------------|
| Array                   | Implemented as `Array` or `Array[]` in Java           |
| Stack                   | `Stack` class in `java.util.Stack`                    |
| Queue                   | `Queue` interface implemented by `LinkedList` or `ArrayDeque` in `java.util` |
| Priority Queue          | `PriorityQueue` class in `java.util.PriorityQueue`    |
| Set                     | `Set` interface implemented by `HashSet`, `TreeSet`, etc. |
| Linked List             | `LinkedList` class in `java.util.LinkedList`          |
| Doubly Linked List      | Can use `LinkedList`, or implement with custom nodes containing next and previous pointers |
| Circular Linked List    | No native type; can be implemented with custom nodes where the last node links to the first |
| Skip List               | No native type; typically implemented using custom nodes for efficient search |
| Hash Map                | `HashMap` class in `java.util.HashMap`                |
| Heap                    | Can use `PriorityQueue` for min-heap; max-heap requires custom comparator |
| Trie                    | No native type; can be implemented using nodes with a `Map<Character, TrieNode>` for children |
| Binary Tree             | No native type; custom class with nodes having left and right children |
| Binary Search Tree      | No native type; custom binary tree with ordered insertion and deletion |
| B-Tree                  | No native type; used in databases; can be implemented with classes allowing multiple children |
| Red-Black Tree          | Implemented as `TreeMap` or `TreeSet`, or can be implemented with custom balancing logic |
| AVL Tree                | No native type; can be implemented with custom balancing based on node heights |
| Graph                   | No native type; can be implemented using adjacency lists (`Map<Vertex, List<Vertex>>`) or adjacency matrix |