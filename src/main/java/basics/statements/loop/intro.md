# Loops

### Different Types of Loop
- For loop
- While loop
- Do-while loop
- For-each loop

## For loop
**For loop** is a control structure in programming that allows you to repeat a block of code a specific number of times.
```java
for (initialization; condition; increment) {
    // Code to be executed
}
```
1. **Initialization**: This step runs once at the beginning and is usually used to define and set the loop counter.

2. **Condition:** Before each iteration, this condition is evaluated. If it is true, the loop continues; if false, the loop ends.

3. **Increment:** This step updates the loop counter after each iteration.

**EXAMPLE**
### For Loop Example: Printing Numbers from 1 to 10
```java
// This program prints the numbers from 1 to 10, inclusive.
for (int i = 1; i <= 10; i = i + 1) {
    System.out.println(i);
}
```
#### Explanation of above code

- **Initialization**: `int i = 1`  
  Starts the counter at 1.

- **Condition**: `i <= 10`  
  Continues the loop while `i` is less than or equal to 10.

- **Increment**: `i = i + 1`  
  Increases `i` by 1 after each iteration.

- **Loop Body**:  
  Executes `System.out.println(i);` to print the current value of `i` to the console, outputting numbers from 1 to 10.



##  While loop
The while loop loops through a block of code as long as a specified condition is true
```
while (condition) {
  // code block to be executed
}
```
**EXAMPLE**
### While Loop Example: Printing Numbers from 1 to 10

```java
// This program prints the numbers from 1 to 10 using a while loop.
int i = 1; // Initialization
while (i <= 10) { // Condition
    System.out.println(i); // Loop Body
    i++; // Increment
}
```
#### Explanation

- **Initialization**:
  - `int i = 1;`  
    Initializes the counter variable `i` to `1`.

- **Condition**:
  - `while (i <= 10)`  
    Checks if `i` is less than or equal to `10`. The loop executes while this condition is `true`.

- **Loop Body**:
  - `System.out.println(i);`  
    Prints the current value of `i` to the console.

- **Increment**:
  - `i++;`  
    Increments `i` by `1` after each iteration.

`For loop and while loop are similar
When we dont know the stop value,we can prefer while loop instead`