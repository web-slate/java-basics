package leet_code.palindrome;

public class QuickSolution {
  public static void main(String[] args) {
    QuickSolution solution = new QuickSolution();
    boolean result = solution.isPalindrome("madam");
    System.out.println("Is 'madam' palindrome: " + result);
  }

  public boolean isPalindrome(String s) {
    String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
  }
}

/**
 * javac leet_code/palindrome/QuickSolution.java
 * java leet_code.palindrome.QuickSolution
 */

