package basics.operators;

public class Comparision_Examples {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;
    System.out.println("State True/False");
    System.out.println("-".repeat(30));
    System.out.println("Whether 10 and 20 are equal: " + (a == b));// Return false since 10 and 20 are not equal
    System.out.println("10 and 20 are not equal: " + (a != b));// returns True
    System.out.println("10 is lesser than 20 : " + (a < b));// returns True
    System.out.println("30 is greater than 20: " + (c > b));// returns True
  }
}
// javac basics/Operators/Comparision_Examples.java && java basics.Operators.Comparision_Examples