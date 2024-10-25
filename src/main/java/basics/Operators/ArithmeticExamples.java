package basics.Operators;

public class ArithmeticExamples {
  public static void main(String[] args) {
    int a = 150;
    int b = 100;
    System.out.println("Addition of 100 + 150:" + (a + b));
    System.out.println("Subraction of 150 - 100:" + (a - b));
    System.out.println("Multiplication of 100 * 150:" + (a * b));
    System.out.println("Division of 150 / 100:" + (a / b));
    System.out.println("Modulus of 150 % 100:" + (a % b));
    System.out.println("Pre Increment of 150:" + (++a));
    System.out.println("Post Decrement of 100:" + (b--));
  }

}
// javac basics/Operators/ArithmeticExamples.java &java basics.Operators.ArithmeticExamples