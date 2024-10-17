package basics.Operators;

public class Assignment {
  public static void main(String[] args) {
    int x = 5; // Assignment operator (=)
    System.out.println("x = " + x); // Output: 5

    // Addition assignment (+=)
    x += 3;
    System.out.println("5 += 3: " + x); // Output: 8

    // Subtraction assignment (-=)
    x -= 2;
    System.out.println("8 -= 2: " + x); // Output: 6

    // Multiplication assignment (*=)
    x *= 4;
    System.out.println("6 *= 4: " + x); // Output: 24

    // Division assignment (/=)
    x /= 3;
    System.out.println("24 /= 3: " + x); // Output: 8

    // Modulus assignment (%=)
    x %= 5;
    System.out.println("8 %= 5: " + x); // Output: 3

    // Bitwise AND assignment (&=)
    x=3; // Binary of 3: 011
    x &= 2; // 10 (binary for 2)
    System.out.println("3 &= 2: " + x); // Output: 2

    // Bitwise OR assignment (|=)
    x |= 1; // Equivalent to: x = x | 1
    System.out.println("x |= 1: " + x); // Output: 3

    // Bitwise XOR assignment (^=)
    x ^= 3; // Equivalent to: x = x ^ 3
    System.out.println("x ^= 3: " + x); // Output: 0

    // Right shift assignment (>>=)
    x = 8; // Binary: 1000
    x >>= 2; // Shift right by 2 positions
            // Result: 0010 (2 in decimal)
    System.out.println("x >>= 2: " + x); // Output: 2

    // Left shift assignment (<<=)
    x <<= 3; // Equivalent to: x = x << 3
    System.out.println("x <<= 3: " + x); // Output: 16
  }
}

// javac basics/Operators/Assignment.java && java basics.Operators.Assignment