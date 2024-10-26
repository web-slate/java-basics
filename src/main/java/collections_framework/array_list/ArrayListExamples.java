package collections_framework.array_list;

import java.util.ArrayList;

public class ArrayListExamples {

  public static void main(String[] args) {
    // Create an ArrayList of Integer (wrapper for int)
    ArrayList<Integer> numbers = new ArrayList<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

    System.out.println("Number at index 1: " + numbers.get(1)); // Outputs 20

    System.out.println("Numbers List:");
    for (Integer number : numbers) {
      System.out.println(number);
    }
  }
}
// javac collections_framework/array_list/ArrayListExamples.java && java
// collections_framework.array_list.ArrayListExamples
