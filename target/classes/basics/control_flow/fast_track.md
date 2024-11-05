## Medium-level Java coding questions that focus on control-flow statements, including loops, conditionals, and switch statements.

#### Question 1: Write a Java program that checks if a given number is prime. The program should prompt the user to enter a number and then output whether it's prime or not. Use appropriate control flow statements to optimize the primality test.

```java
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
/* Sample Output
Enter a number to check if it's prime: 5
5 is a prime number.*/
```
#### Question 2: Create a number guessing game where the computer generates a random number between 1 and 100, and the user tries to guess it. The program should provide hints (higher/lower) and count the number of attempts. Use a combination of loops and conditionals to implement this game.

```java
import java.util.Scanner;
import java.util.Random;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess;
        int attempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < numberToGuess) {
                System.out.println("Higher! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Lower! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " correctly!");
                System.out.println("It took you " + attempts + " attempts.");
            }
        } while (userGuess != numberToGuess);
    }
}
/*Output
Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.
Enter your guess: 19
Lower! Try again.
Enter your guess: 8
Congratulations! You've guessed the number 8 correctly!
It took you 2 attempts.*/
```

#### Question 3: Write a Java program that checks if a given number is an Armstrong number. An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits. For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153. Use appropriate loops and conditionals to implement this.

```java
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        return sum == originalNumber;
    }
}
/*Output
Enter a number to check if it's an Armstrong number: 153
153 is an Armstrong number.
*/
```