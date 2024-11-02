### CORE Basics

1. **Q: What is Java?**
    - Java is a high-level, object oriented, platform independent programming language. Its key features include being WORA (Write Once, Run Anywhere), 
    - having built-in garbage collection, and supporting multithreading.
    - Its different from C++ due to its automatic memory management and absence of pointers.

1. **Q: What is JVM?**
    - JVM means Java Virtual Machine.
    - Its an abstract computing machine responsible for converting java byte code to machine code.

1. **Q: How does garbage collection work in Java?**
   - Garbage collection is the process by which the JVM automatically identifies and discards objects that are no longer in use, freeing up memory resources. 
   - The JVM's garbage collector runs periodically, looking for objects that have no active references to free up (eligible for collection).

1. **Q: How to manually trigger garbage collection?**
   - You can suggest it by calling `System.gc()` or `Runtime.getRuntime().gc()`. However, this is just a hint to the JVM, and it may choose to ignore the request. The JVM will determine the best time to perform garbage collection based on its internal algorithms.

1. **Q: Different data types in Java? differentiate between primitive and non-primitive data types??**
   - Java supports two main types of data, they are primitive and non-primitive data types.
   - **Primitive types**: Basic data types like byte, int, short, long, float, double, char, boolean.
   - **Non Primitive types**: Objects and arrays (e.g., String, ArrayList, etc.). These types are created by the programmer.

1. **Q: What is an array? How do you declare, initialize, and access elements in an array in Java?**
   - An array is a collection of elements of the same type stored in contiguous memory locations.
   - It is used to store multiple values in a single variable.
   - **Declaration**: `int[] numbers`;
   - **Initialization**: `numbers = new int[5];` or `int[] numbers = {1, 2, 3, 4, 5};`
   - **Accessing elements**:  Use the index (e.g., `numbers[0]` to access the first element).

1. **Q: Why data types divided in to two types (primitive and non-primitive)?**
   - answers

1. **Q: Difference between the == operator and the equals() method in Java?**
   - The `==` operator checks if two references point to the same memory location.
   - `==` operator used to compare primitive data types or to check if two objects refer to the same instance.
   - `equals()` method is used to check if two objects are logically equivalent, meaning it compares the actual content or state of the objects.
   - For example, String class overrides equals() to compare the contents of the strings rather than their memory addresses.

1. **Q: What is the purpose of the try-catch block? What happens if an exception is not caught?**
   - A try-catch block is used to handle exceptions in Java. 
   - The code that might throw an exception is placed in the try block, and any handling code goes in the catch block.
   - Exceptions in Java can be handled using try-catch blocks.

1. **Q: What is an exception? How do you handle exceptions in Java?**
   - An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. 
   - There is Checked exceptions and Unchecked exceptions are exist.

1. **Q: Qistinguishes between Checked exceptions and Unchecked exceptions?**
   - **Checked exceptions**: Must be caught or declared in the method signature using throws. These are checked at compile time (e.g., IOException)
   - **Unchecked exceptions**: Do not need to be caught or declared. These occur at runtime (e.g., ArithmeticException, NullPointerException).

1. **Q: What is a package in Java? Why do we use packages?**
   - A package in Java is a namespace that groups related classes and interfaces together. 
   - It helps organize code in a modular way, making it easier to manage and avoid naming conflicts.
   - Packages also help in access protection by specifying different access levels for classes and members.
   - Java has built-in packages (e.g., java.lang, java.util), and developers can create custom packages.
   - > you cannot have more than one package statement in a single Java source file. However, you can import multiple packages using multiple import statements.

1. **Q: What is a 'String' in Java, and how is it different from a 'StringBuilder' or 'StringBuffer'?**
   - A `String` in Java is an immutable object, meaning once a String is created then value cannot be changed. 
   - But `StringBuilder` and `StringBuffer` help to mutate and they are mutable classes that allow you to modify the contents without creating new objects.

1. **Q: Difference between `StringBuffer` and `StringBuilder`?**
   - `StringBuffer` is thread-safe (synchronized) but StringBuilder is not.
   - `StringBuilder` faster for single-threaded scenarios.

1. **Q: What are the loops available in Java and give examples?**
   - **for loop**: When number of iterations is known beforehand.
      ```
        for (int i = 0; i < 5; i++) {
          System.out.println(i);
        }
      ```
   - **while loop**: When number of iterations is not known and the loop should continue while a condition is true.
      ```
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
      ```
   - **do-while loop**: Similar to the while loop, but the code executes at least once even if the condition is false.
      ```
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
      ```
   - **Enhanced for loop (for-each)**: Used for iterating over arrays or collections.
      ```
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }
      ```

1. **Q: List a few more checked exceptions and their examples?**
   - **IOException**: Occurs when an input-output operation fails.
      ```
        import java.io.FileReader;
        import java.io.IOException;

        public class CheckedExceptionExample {
            public static void main(String[] args) {
                try {
                    FileReader reader = new FileReader("file.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
      ```
   - **SQLException**: Occurs when there is a database access error.
      ```
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;

        public class DatabaseExample {
            public static void main(String[] args) {
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
      ```

   - **ClassNotFoundException**: Occurs when a specified class cannot be found.
      ```
        public class ClassNotFoundExample {
            public static void main(String[] args) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
      ```

### Multi Threading

1. **Q: What is thread safety?**
   - **Share data between Threads**: Thread safety ensures that shared data is accessed by multiple threads in a way that prevents data corruption or inconsistency.
   - When an object or method is thread-safe, it means that it can be used safely by multiple threads simultaneously without causing concurrency issues.
  
1. **Q: Why thread safety?**
   - Thread safety became crucial with the advent of multi-threading capabilities in Java.

1. **Q: When thread safety was introduced?**
   - Supported from the earliest versions of Java (Java 1.0).

1. **Q: When thread safety was introduced?**
   - Supported from the earliest versions of Java (Java 1.0).

1. **Q: When to use thread safety?**
   - When multiple threads need to access shared resources (like a variable, collection, or database).
   - When operations need to be atomic to avoid race conditions.

1. **Q: Give a real-time example of thread safe feature?**
   - A banking application where multiple threads may be processing transactions on the same account simultaneously. For instance, depositing and withdrawing money must be thread-safe to avoid race conditions.
   - Using synchronized blocks or thread-safe collections like ConcurrentHashMap can ensure data consistency.

1. **Q: Give me an example ?**
   - A race condition occurs when two or more threads access shared data and try to change it at the same time without proper synchronization.
    ```
      public class RaceConditionExample {
          private int counter = 0;

          public void increment() {
              counter++;
          }

          public int getCounter() {
              return counter;
          }

          public static void main(String[] args) {
              RaceConditionExample example = new RaceConditionExample();

              Thread t1 = new Thread(() -> {
                  for (int i = 0; i < 1000; i++) {
                      example.increment();
                  }
              });

              Thread t2 = new Thread(() -> {
                  for (int i = 0; i < 1000; i++) {
                      example.increment();
                  }
              });

              t1.start();
              t2.start();

              try {
                  t1.join();
                  t2.join();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }

              // The expected output is 2000, but due to race conditions, the actual output may be less than 2000.
              System.out.println("Final counter value: " + example.getCounter());
          }
      }
    ```

1. **Q: int vs Integer vs AtomicInteger ?**

    | Feature         | `int` (primitive)                          | `Integer` (wrapper class)                         | `AtomicInteger` (thread-safe)                   |
    |-----------------|--------------------------------------------|--------------------------------------------------|------------------------------------------------|
    | **Type**        | Primitive data type                        | Reference (wrapper) type, part of the java.lang package  | Thread-safe class for integer operations       |
    | **Nullability** | Cannot be `null`                           | Can be `null`                                    | Cannot be `null`                               |
    | **Memory Usage**| Less memory, as it is a primitive          | More memory due to object overhead               | More memory due to atomic operations           |
    | **Mutability**  | Immutable                                  | Immutable (requires creating a new object for changes) | Mutable with atomic operations             |
    | **Thread Safety** | Not thread-safe                         | Not thread-safe                                  | Thread-safe                                    |
    | **Usage Example** | `int a = 5;`                             | `Integer a = 5;`                                 | `AtomicInteger a = new AtomicInteger(5);`      |
    | **Use Case**    | Basic arithmetic operations                | Useful in collections like `ArrayList`           | Useful for concurrency (e.g., counters)        |
    | **Performance in Multithreading**    | -                | Needs explicit synchronization for thread safety           | No need for synchronization, better performance        |

    ```
      import java.util.concurrent.atomic.AtomicInteger;

      public class IntegerComparisonExample {
          public static void main(String[] args) {
              int primitiveInt = 5;
              Integer wrapperInt = 5;
              AtomicInteger atomicInt = new AtomicInteger(5);

              // Basic operations
              primitiveInt += 1;
              wrapperInt += 1; // Auto-boxing
              atomicInt.incrementAndGet(); // Thread-safe increment

              System.out.println("primitiveInt: " + primitiveInt); // 6
              System.out.println("wrapperInt: " + wrapperInt);     // 6
              System.out.println("atomicInt: " + atomicInt.get()); // 6
          }
      }
    ```

1. **Q: List all the atomic types?**

| Atomic Class                     | Purpose                              | Sample Code                                                                                                                                                  |
|----------------------------------|--------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **AtomicInteger**                | Thread-safe `int` operations         | ```java\nimport java.util.concurrent.atomic.AtomicInteger;\nAtomicInteger atomicInt = new AtomicInteger(0);\natomicInt.incrementAndGet(); // Atomically increments to 1\nint value = atomicInt.get(); // Gets the current value (1)\n``` |
| **AtomicLong**                   | Thread-safe `long` operations        | ```java\nimport java.util.concurrent.atomic.AtomicLong;\nAtomicLong atomicLong = new AtomicLong(10L);\natomicLong.addAndGet(5); // Adds 5 atomically, result is 15\nlong value = atomicLong.get(); // Gets the current value (15)\n```   |
| **AtomicBoolean**                | Thread-safe `boolean` operations     | ```java\nimport java.util.concurrent.atomic.AtomicBoolean;\nAtomicBoolean atomicBoolean = new AtomicBoolean(false);\natomicBoolean.set(true); // Sets to true\nboolean value = atomicBoolean.get(); // Gets the current value (true)\n```   |
| **AtomicReference<V>**           | Thread-safe reference for objects    | ```java\nimport java.util.concurrent.atomic.AtomicReference;\nAtomicReference<String> atomicRef = new AtomicReference<>("initial");\natomicRef.set("updated"); // Updates atomically\nString value = atomicRef.get(); // Gets the current value ("updated")\n```   |
| **AtomicIntegerArray**           | Thread-safe `int` array             | ```java\nimport java.util.concurrent.atomic.AtomicIntegerArray;\nAtomicIntegerArray atomicArray = new AtomicIntegerArray(5); // Creates an array of size 5\natomicArray.set(0, 10); // Sets index 0 to 10\nint value = atomicArray.get(0); // Gets the value at index 0 (10)\n```   |
| **AtomicLongArray**              | Thread-safe `long` array            | ```java\nimport java.util.concurrent.atomic.AtomicLongArray;\nAtomicLongArray atomicLongArray = new AtomicLongArray(3); // Array of size 3\natomicLongArray.set(1, 100L); // Sets index 1 to 100\nlong value = atomicLongArray.get(1); // Gets value at index 1 (100)\n```   |
| **AtomicReferenceArray<V>**      | Thread-safe object array            | ```java\nimport java.util.concurrent.atomic.AtomicReferenceArray;\nAtomicReferenceArray<String> atomicRefArray = new AtomicReferenceArray<>(3);\natomicRefArray.set(2, "Hello"); // Sets value at index 2\nString value = atomicRefArray.get(2); // Gets value at index 2 ("Hello")\n```   |
| **AtomicStampedReference<V>**     | Reference with version control      | ```java\nimport java.util.concurrent.atomic.AtomicStampedReference;\nAtomicStampedReference<String> stampedRef = new AtomicStampedReference<>("init", 1);\nint[] stamp = new int[1];\nString value = stampedRef.get(stamp); // Gets value and stamp\nstampedRef.compareAndSet("init", "updated", stamp, stamp + 1); // Updates with stamp\n```   |
| **AtomicMarkableReference<V>**    | Reference with boolean marker       | ```java\nimport java.util.concurrent.atomic.AtomicMarkableReference;\nAtomicMarkableReference<String> markableRef = new AtomicMarkableReference<>("init", false);\nbool[] mark = new bool[1];\nString value = markableRef.get(mark); // Gets value and mark\nmarkableRef.compareAndSet("init", "updated", false, true); // Updates value and mark\n```   |

### OOPS

1. **Q: What is Class in Java?**
   - Class is a blue print for creating objects.
   - Defining attributes (members / properties / variable)
   - Defining behaviours (methods, class functions)

1. **Q: What is object in Java?**
   - Its an instance of a class.

1. **Q: What is 'this' keyword in Java?**
   - The this keyword in Java is a reference to the current object instance.
   - if a parameter name in a constructor or method has the same name as an instance variable, you can use this to differentiate between the instance variable and the parameter.
      ```
        public class Example {
          int number;

          public Example(int number) {
              this.number = number; // 'this.number' refers to the instance variable, 'number' is the parameter
          }
        }
      ```

1. **Q: What is Access Modifiers in Java?**

      | Modifier | Description                                             |
      |-----------|---------------------------------------------------------|
      | Public       | No restrictions on access. Accessible from any other class. |
      | Private      | Accessible only within the declared class.           |
      | Protected       | Accessible within the same package and subclasses.            |
      | Default   | Accessible only within the same package.                             |

      ```
        package com.example;

        public class AccessModifiersExample {
            public int publicVar = 1;       // Accessible from anywhere
            protected int protectedVar = 2; // Accessible within the same package and subclasses
            int defaultVar = 3;             // Accessible within the same package (default access)
            private int privateVar = 4;     // Accessible only within this class

            public void publicMethod() {
                System.out.println("Public Method");
            }

            protected void protectedMethod() {
                System.out.println("Protected Method");
            }

            void defaultMethod() {
                System.out.println("Default Method");
            }

            private void privateMethod() {
                System.out.println("Private Method");
            }
        }

        // Example usage in another class within the same package
        package com.example;

        public class AccessTest {
            public static void main(String[] args) {
                AccessModifiersExample example = new AccessModifiersExample();
                System.out.println(example.publicVar); // Accessible
                System.out.println(example.protectedVar); // Accessible
                System.out.println(example.defaultVar); // Accessible
                // System.out.println(example.privateVar); // Not accessible

                example.publicMethod(); // Accessible
                example.protectedMethod(); // Accessible
                example.defaultMethod(); // Accessible
                // example.privateMethod(); // Not accessible
            }
        }
      ```

1. **Q: What is constructor and difference between other methods?**
   - Its a special type of method used to initialize objects.
   - It will be called when an object is created - `ClasssName objectName = new ClasssName()`
   - Unlike regular methods, constructors do not have a return type.
   - **Main Difference**: Methods perform specific operations, whereas constructors initialize the state of an object.

1. **Q: What is static method, variables in Java?**
   - Static methods and variables belong to the class rather than any specific instance of the class.
   - They can be accessed directly using the class name without creating an object.
   - **When to use**: Use static members when you want to share the same data or behavior across all instances of a class (e.g., a counter or utility methods like Math.sqrt()).

1. **Q: What is Method overloading in Java and difference between overloading and overriding?**
   - **Method Overloading**: Allows multiple methods with the same name but different parameter lists (type, number, or both) within the same class.
   - > Useful in scenarios where the same operation needs to be performed on different types or numbers of inputs.
   - **Method Overriding**: Allows a subclass to provide a specific implementation for a method already defined in its parent class.
   - > Commonly used in inheritance to provide a specific implementation for a method defined in a superclass.
    ```
      // Method Overloading: Same method name but different parameters.
      public class OverloadingExample {
          public void display(int number) {
              System.out.println("Number: " + number);
          }

          public void display(String text) {
              System.out.println("Text: " + text);
          }

          public static void main(String[] args) {
              OverloadingExample example = new OverloadingExample();
              example.display(10); // Calls the method with int parameter
              example.display("Hello"); // Calls the method with String parameter
          }
      }
    ```

    ```
      // Method Overriding: Same method name, parameters, and return type in subclass.
      class Parent {
          public void show() {
              System.out.println("Parent's show()");
          }
      }

      class Child extends Parent {
          @Override
          public void show() {
              System.out.println("Child's show()");
          }
      }

      public class OverridingExample {
          public static void main(String[] args) {
              Parent obj = new Child();
              obj.show(); // Output: Child's show()
          }
      }
    ```

1. **Q: What is the significance of the final keyword in Java?**
   - `final` keyword can be used in three different contexts:
   - **Final variable**: Its value cannot be changed once initialized (constant).
   - **Final method**: Cannot be overridden by subclasses.
   - **Final class**: Cannot be extended by any other class.

### Collection Framework

1. **Q: Can you explain the difference between ArrayList and LinkedList?**
   - Both ArrayList and LinkedList are implementations of the List interface in Java.
   - **ArrayList**: Internally uses a dynamic array to store elements.
   - It's more efficient for retrieving elements (get and set operations) because elements can be accessed directly via their index.
   - However, inserting or deleting elements in the middle of the list will be slower because it requires shifting elements.
   - **LinkedList**: Uses a doubly linked list to store elements.
   - It is more efficient for inserting and deleting elements anywhere in the list.
   - However, accessing elements is slower because it requires traversing the list.

1. **Q: Can I Use equals() for All Collections Like ArrayList, Vector, List, etc.?**
   - Yes, you can use the `equals()` method for all standard Java collection classes like ArrayList, Vector, LinkedList, etc.
   - When you use `equals()` on collections, it checks for equality based on the elements and their order in the collection.
    ```
        import java.util.ArrayList;
        import java.util.Vector;

        public class CollectionEqualsExample {
            public static void main(String[] args) {
                ArrayList<String> list1 = new ArrayList<>();
                list1.add("A");
                list1.add("B");
                list1.add("C");

                Vector<String> list2 = new Vector<>();
                list2.add("A");
                list2.add("B");
                list2.add("C");

                System.out.println("Are the collections equal? " + list1.equals(list2)); // Output: true
            }
        }
      ```