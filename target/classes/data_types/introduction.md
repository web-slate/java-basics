## Two Data Types
  1. Primitive data types (8 - byte, short, int, long, float, double, boolean, char)
  1. Non-primitive data types (4 - String, Array, Class, Interface)

### Eight Primitive Data Types
  - Primitive types are predefined (already defined) in Java. 
  - A primitive type always has a value.
  - A primitive type starts with a lowercase letter.

1. **Integer Types**
    1. byte
    1. short
    1. int
    1. long
1. **Floating Point Types**
    1. float
    1. double 
1. **Other Types**
    1. boolean 
    1. char

### Below is the table for all Primitive Data Types.

| Data Type | Size      | Description                                                     |
|-----------|-----------|-----------------------------------------------------------------|
| byte      | 1 byte    | Stores whole numbers from -128 to 127                          |
| short     | 2 bytes   | Stores whole numbers from -32,768 to 32,767                    |
| int       | 4 bytes   | Stores whole numbers from -2,147,483,648 to 2,147,483,647      |
| long      | 8 bytes   | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float     | 4 bytes   | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits |
| double    | 8 bytes   | Stores fractional numbers. Sufficient for storing 15 decimal digits |
| boolean   | 1 bit     | Stores true or false values                                     |
| char      | 2 bytes   | Stores a single character/letter or ASCII values               |

### What Happens When We Assign Numbers Outside the Given Range?

When you assign a number outside the given range of a byte in Java, which is from -128 to 127, it leads to an overflow. However, the following code will not compile due to a type mismatch:

```java
byte num = 200; // error: incompatible types: possible lossy conversion from int to byte
System.out.println(num);
```
```java
long e = 1000000000000000000000000000L; //error: integer number too large
System.out.println(num);
```
### Why these ranges in these data types?
 - The range of integer data types such as byte, short, int, and long is determined by the number of bits allocated for each type and the way these bits are used to represent signed integers in binary.
 - The ranges are derived from the number of bits and the method of two's complement representation
 - Since two's complement representation allocates one bit for the sign, it allows for an extra negative value compared to positive values. This is why, for example, an 8-bit byte can represent from -128 to 127 (128 negative values including zero).

### Four Non-Primitive Data Types
 - Non-primitive types are created by the programmer and is not defined by Java (except for String).
 - Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
 - non-primitive types can be null.
 - non-primitive types starts with an uppercase letter.

1. **String**
    1. The String object has methods that are used to perform certain operations on strings. 
1. **Array**
    1. The Array notes goes here. 
1. **Class**
    1. The Class notes goes here. 
1. **Interface**
    1. The Interface notes goes here. 