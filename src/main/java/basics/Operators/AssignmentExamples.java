package basics.Operators;

public class AssignmentExamples {
  public static void main(String[] args) {
    int x = 5; // Assignment operator (=)
    System.out.println("x = " + x); 

    // Addition assignment (+=)
    x += 3;
    System.out.println("5 += 3 should returns 8 and x is " + x); 

    // Subtraction assignment (-=)
    x -= 2;
    System.out.println("8 -= 2 should returns 6 and x is: " + x); 

    // Multiplication assignment (*=)
    x *= 4;
    System.out.println("6 *= 4 should returns 24 and x is: " + x); 

    // Division assignment (/=)
    x /= 3;
    System.out.println("24 /= 3 should returns 8 and x is " + x); 

    // Modulus assignment (%=)
    x %= 5;
    System.out.println("8 %= 5 should returns 3 and x is " + x); 

    // Bitwise AND assignment (&=)
    x=3; // Binary of 3: 011
    x &= 2; // 10 (binary for 2)
    System.out.println("3 &= 2 should returns 2 and x is " + x); 

    // Bitwise OR assignment (|=)
    x |= 1; // Equivalent to: x = x | 1
    System.out.println("x |= 1 should returns 3 and x is " + x); 

    // Bitwise XOR assignment (^=)
    x ^= 3; // Equivalent to: x = x ^ 3
    System.out.println("x ^= 3 should returns 0 and x is " + x); 

    // Right shift assignment (>>=)
    x = 8; // Binary: 1000
    x >>= 2; // Shift right by 2 positions
            // Result: 0010 (2 in decimal
    System.out.println("x >>= 2 should returns 2 and x is " + x);  

    // Left shift assignment (<<=)
    x <<= 3; // Equivalent to: x = x << 3
    System.out.println("x <<= 3 should returns 16 and x is " + x); 
  }
}

// javac basics/Operators/AssignmentExamples.java && java basics.Operators.AssignmentExamples