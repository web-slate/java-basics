package data_types.math;

public class MathExamples {
  public static void main (String[] args) {
    MathExamples mathExamples = new MathExamples();
    mathExamples.absExample();
    mathExamples.ceilFloorAndRoundExample();
  }

  public void absExample() {
    int number = -10;
    int absValue = Math.abs(number);
    System.out.println("Absolute value of -10 is " + absValue);
  }

  public void ceilFloorAndRoundExample() {
    double age = 35.4f;
    System.out.println("My age is " + age);
    double forwardMyAge = Math.ceil(age);
    System.out.println("My age after this year: " + forwardMyAge);
    double youngAge = Math.floor(age);
    System.out.println("My young age: " + youngAge);
    double roundAge = Math.round(age);
    System.out.println("My Round young age: " + roundAge);
  }
}

/**
 * javac data_types/math/MathExamples.java && java data_types/math/MathExamples
 */