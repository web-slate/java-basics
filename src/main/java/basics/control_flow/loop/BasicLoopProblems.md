# Some Basic Java Coding Problems that focus on using loops

#### Question 1: Write a Java program that prints numbers from 1 to 10 using a for loop.
```java
public class Question1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
    }
}
/*Output
12345678910*/
```

#### Question 2: Write a Java program that calculates the sum of all numbers from 1 to 100 using a while loop.

```java
public class Question2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
    }
}
//Output
//The sum of numbers from 1 to 100 is:5050
```
#### Question 3: Write a Java program that prints the multiplication table (from 1 to 10) of a number entered by the user using a for loop.
```java
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
/*Sample Output
Enter a number: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
*/
```
#### Question 4: Write a Java program that calculates the factorial of a number entered by the user using a do-while loop.

```java
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        long factorial = 1;
        int i = 1;
        
        do {
            factorial *= i;
            i++;
        } while (i <= number);
        
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
/* Sample Output
Enter a non-negative integer: 5
The factorial of 5 is: 120
*/
```
### Question 5: Write a Java program that prints the first n numbers in the Fibonacci sequence, where n is entered by the user. Use a for loop to generate the sequence.

```java
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int n = scanner.nextInt();
        
        int first = 0, second = 1;
        
        System.out.println("Fibonacci Sequence:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
/* Sample Output
Enter the number of Fibonacci terms to generate: 6
Fibonacci Sequence:
0 1 1 2 3 5 
*/
```