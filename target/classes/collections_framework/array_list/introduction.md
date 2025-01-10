# Array List
- Java ArrayList is a part of the Java collections framework

- Array list is useful for creating dynamic sized arrays;(dynamic sized arrays resize themself)

- We cannot directly use primitive data types  in an ArrayList ; instead we can use wrapper class

```java
 // Attempting to create an ArrayList of int (primitive type) - this will cause a compilation error
        ArrayList<int> numbers = new ArrayList<>();  // Error: int cannot be used as a type argument
```

- advantage of ArrayList is it is not neecessary to mention the size of ArrayList.

## Difference between Array and ArrayList
| Feature              | Array                 | ArrayList                        |
|----------------------|-----------------------|----------------------------------|
| Size                 | Fixed                 | Dynamic                          |
| Data Type Support    | Primitives & Objects  | Objects only                     |
| Performance          | Faster                | Slightly slower due to resizing  |
| Memory Efficiency    | More efficient        | Less efficient                   |
| Built-in Methods     | Fewer                 | More (add, remove, etc.)         |
| Use Case             | Fixed-size data       | Dynamic data                     |
