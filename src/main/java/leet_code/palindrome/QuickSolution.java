package leet_code.palindrome;

public class QuickSolution {
  public boolean isPalindrome(String s) {
      String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
  }
}

// javac leet_code/palindrome/QuickSolution.java && java leet_code.palindrome.QuickSolution
// mvn -Dtest=leet_code.palindrome.tests.QuickSolutionTest test
// mvn -Dtest=QuickSolutionTest test