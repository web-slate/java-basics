package leet_code.string.easy.valid_palindrome_2;

/**
* ## 680. Valid Palindrome II (easy) - Two Pointers
 * 
 * Given a string s, return true if the s can be palindrome after deleting at
 * most one character from it.
 * 
 * 
 * **Example 1**:
 * - Input: s = "aba"
 * - Output: true
 * 
 * **Example 2**:
 * - Input: s = "abca"
 * - Output: true
 * - Explanation: You could delete the character 'c'.
 * 
 * **Example 3**:
 * - Input: s = "abc"
 * - Output: false
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 105
 * s consists of lowercase English letters.
 * 
* ### Rough Approach: Quick Solution
 * **Approach**: This uses uses a two-pointer technique to check for mismatches
 * while traversing from both ends of the string towards the center.
 * If a mismatch occurs, it checks if either of the substrings (after removing
 * one character) can form a palindrome.
 * 
 * **Technique**: Two-pointer technique.
 * **Limitation**: This solution is incomplete as it doesn't handle the one
 * character deletion case
 * 
 * 
 * > 🕒 Time Complexity is linear O(n), where n is the length of s, as it
 * iterates from both ends.
 * > 💾 Space Complexity is constant O(1)), no additional space is used.
 * 
* ### Approach 1: Brute Force
 * **In this approach, we'll try removing each character one by one and checking
 * if the resulting string is a palindrome.
 * 
 * 
 * > 🕒 Time Complexity is Quadratic O(n2), as we potentially check 𝑛 n
 * possible strings and perform an 𝑂 (𝑛) O(n) palindrome check on each.
 * > 💾 Space Complexity is constant O(1), since we do not use extra space.
 * 
 * **Explanation**: Tries to remove each character to check for a palindrome,
 * making it inefficient for larger strings but straightforward.
 * 
 * Runtime: 14ms Beats 31.25%
 * Memory: 44.92 MB and Beats 25.15%
 * 
* ### Approach 2: Sub Optimal solution uses Uses recursion.
 * **In this approach**: This solution uses a single check with two pointers,
 * attempting to only make the minimum number of recursive calls.
 * 
 * 1. **Why Sub-Optimal**?: Uses stack space and multiple string operations.
 * 
 * > 🕒 Time Complexity is linear O(n), for the two-pointer pass.
 * > 💾 Space Complexity is constant O(1) as it uses no extra space.
 * 
 * **Explanation**: Efficiently skips one mismatch, checking both alternatives
 * with recursive-like checks but without true recursion, which keeps it simple
 * and faster than brute force.
 * 
 * Runtime: 5ms Beats 42.65%
 * Memory: 50.09 MB and Beats 5.93%
 * 
* ### Approach 3: Optimized Solution using Two pointers with optimized
 * validation
 * **Technique**: Two-pointer technique with early termination.
 * **Improvements**: No string manipulation, Minimal checks, Early termination,
 * Minimizes the number of comparisons.
 * 
 * It uses a constant amount of space and a single loop with two pointers.
 * 
 * > 🕒 Time Complexity is linear O(n) where n is string length, since we
 * traverse the entire string once (Single pass through string).
 * > 💾 Space Complexity is constant O(1) as we only use pointers.
 * 
 * Runtime: 2ms Beats 99.27%
 * Memory: 43.03 MB and Beats 64.40%
 */

public class ValidPalindrome2Problem {
  public static void main(String[] args) {
    ValidPalindrome2Problem solution = new ValidPalindrome2Problem();

    // Test cases
    String famous_example = "madam";
    String example_1 = "aba";
    String example_2 = "abca";
    String example_3 = "abc";

    // Running test cases using different methods
    System.out.println("\nQuick Solution \n" + "-".repeat(30));
    System.out.println("Is famous_example 'madam' palindrome: " + solution.quickSolution(famous_example));
    System.out.println("Is " + example_1 + " is palindrome: " + solution.quickSolution(example_1));
    System.out.println("Is " + example_2 + " is palindrome: " + solution.quickSolution(example_2));
    System.out.println("Is " + example_3 + " is not palindrome: " + solution.quickSolution(example_3));

    System.out.println("\nBrute Force \n" + "-".repeat(30));
    System.out.println("Is famous_example 'madam' palindrome: " + solution.bruteForce(famous_example));
    System.out.println("Is " + example_1 + " is palindrome: " + solution.bruteForce(example_1));
    System.out.println("Is " + example_2 + " is palindrome: " + solution.bruteForce(example_2));
    System.out.println("Is " + example_3 + " is not palindrome: " + solution.bruteForce(example_3));

    System.out.println("\nSub Optimal \n" + "-".repeat(30));
    System.out
        .println("Is famous_example 'madam' palindrome: " + solution.subOptimalSolutionUsingRecursive(famous_example));
    System.out.println("Is " + example_1 + " is palindrome: " + solution.subOptimalSolutionUsingRecursive(example_1));
    System.out.println("Is " + example_2 + " is palindrome: " + solution.subOptimalSolutionUsingRecursive(example_2));
    System.out
        .println("Is " + example_3 + " is not palindrome: " + solution.subOptimalSolutionUsingRecursive(example_3));

    System.out.println("\nOptimal \n" + "-".repeat(30));
    System.out.println(
        "Is famous_example 'madam' palindrome: " + solution.optimalSolutionUsingInPlaceTwoPointer(famous_example));
    System.out
        .println("Is " + example_1 + " is palindrome: " + solution.optimalSolutionUsingInPlaceTwoPointer(example_1));
    System.out
        .println("Is " + example_2 + " is palindrome: " + solution.optimalSolutionUsingInPlaceTwoPointer(example_2));
    System.out.println(
        "Is " + example_3 + " is not palindrome: " + solution.optimalSolutionUsingInPlaceTwoPointer(example_3));
  }

  public boolean quickSolution(String s) {
    // Initialize two pointers at start and end
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    int left = 0;
    int right = s.length() - 1;

    // Compare characters from both ends
    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        // If characters don't match, try skipping current character
        // from either left or right side
        return quickSoltutionHelperMethod(s, left + 1, right) ||
            quickSoltutionHelperMethod(s, left, right - 1);
      }
      left++;
      right--;
    }
    return true;
  }

  // Helper method to check if substring is palindrome
  private boolean quickSoltutionHelperMethod(String s, int left, int right) {
    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  public boolean bruteForce(String s) {
    for (int i = 0; i < s.length(); i++) {
      if (bruteForceIsPalindromeRecursive(s, i)) {
        return true;
      }
    }
    return false;
  }

  private boolean bruteForceIsPalindromeRecursive(String s, int skip) {
    int left = 0, right = s.length() - 1;

    while (left < right) {
      if (left == skip)
        left++; // Skip the specified character
      if (right == skip)
        right--;

      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }

    return true;
  }

  public boolean subOptimalSolutionUsingRecursive(String s) {
    // Initialize pointers
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    int left = 0;
    int right = s.length() - 1;

    // Check characters from both ends
    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        // Try skipping left character
        if (subOptimalIsPalindromeRecursive(s, left + 1, right)) {
          return true;
        }
        // Try skipping right character
        return subOptimalIsPalindromeRecursive(s, left, right - 1);
      }
      left++;
      right--;
    }
    return true;
  }

  private boolean subOptimalIsPalindromeRecursive(String s, int left, int right) {
    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  public boolean optimalSolutionUsingInPlaceTwoPointer(String s) {
    // Initialize pointers
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    int left = 0;
    int right = s.length() - 1;

    // Main loop to check characters
    while (left < right) {
      // If characters don't match
      if (s.charAt(left) != s.charAt(right)) {
        // Try both possibilities: remove left or right character
        return optimalIsPalindromeRecursive(s, left + 1, right) ||
            optimalIsPalindromeRecursive(s, left, right - 1);
      }
      left++;
      right--;
    }
    return true;
  }

  private boolean optimalIsPalindromeRecursive(String s, int i, int j) {
    // Check if substring is palindrome without any deletion
    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}

/**
 * Run Command:
 * javac leet_code/string/easy/valid_palindrome_2/ValidPalindrome2Problem.java
 * && java leet_code/string/easy/valid_palindrome_2/ValidPalindrome2Problem
 */
