package leet_code.string.easy.valid_palindrome;

/**
* ## 125. Valid Palindrome (easy) - Two Pointers
 * 
 * > A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads the
 * same forward and backward. Alphanumeric characters include letters and
 * numbers.
 * 
 * Given a string `s`, return `true` if it is a palindrome, or `false`
 * otherwise.
 * 
 * 
 * **Example 1**:
 * - Input: s = "A man, a plan, a canal: Panama"
 * - Output: true
 * - Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * **Example 2**:
 * - Input: s = "race a car"
 * - Output: false
 * - Explanation: "raceacar" is not a palindrome.
 * 
 * **Example 3**:
 * - Input: s = " "
 * - Output: true
 * - Explanation: s is an empty string "" after removing non-alphanumeric
 * characters.
 * - Since an empty string reads the same forward and backward, it is a
 * palindrome.
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 * 
* ### Rough Approach: Quick Solution
 * **This quick solution uses regular expressions to clean the string and checks
 * if it reads the same backward and forward by comparing the cleaned string to
 * its reversed form.
 * 
 * 1. Regular Expression & String Reversal
 * 1. Each prefix by iterating through all elements up to the current index.
 * 1. Current index to find the maximum value. Then, we compute the score for
 * that prefix.
 * 
 * 
 * > 🕒 Time Complexity is linear O(n) for (Cleaning string using regex: O(n)
 * and Reversing string: O(n) and Comparing two strings: O(n)).
 * and 💾 Space Complexity is linear O(n) for (Storing cleaned string: O(n) and
 * Reversed string: O(n))
 * 
* ### Approach 1: Brute Force
 * **In this approach, String Manipulation and Reversal will be used.
 * 
 * **Why Brute Force***?: Creates new string and reverses it - more memory
 * intensive
 * 
 * 1. Solution involves cleaning the string first by removing non-alphanumeric
 * characters.
 * 1. and then converting it to lowercase.
 * 1. After that, it checks if the cleaned string is a palindrome by comparing
 * it to its reverse.
 * 
 * > 🕒 Time Complexity is Quadratic O(n) (Cleaning Loop: O(n), Reversal: O(n),
 * Comparison: O(n)).
 * and 💾 Space Complexity is linear O(n) for for storing the result array ans.
 * 
 * Runtime: 14ms Beats 31.25%
 * Memory: 44.92 MB and Beats 25.15%
 * 
* ### Approach 2: Sub Optimal solution uses Uses recursion.
 * **In this approach, we use recursion**
 * 
 * 1. **Why Sub-Optimal**?: Uses stack space and multiple string operations.
 * 
 * > 🕒 Time Complexity is linear O(n) and 💾
 * Space Complexity is constant O(n) due to recursion stack but less efficient
 * due to stack overhead and not suitable for very long strings due to stack
 * overflow risk.
 * 
 * Runtime: 5ms Beats 42.65%
 * Memory: 50.09 MB and Beats 5.93%
 * 
* ### Approach 3: Optimized Solution using Two Pointer without extra space
 * (In-place two pointer approach also
 * known as Two-Pointer Technique with In-place Checking)
 * **This solution combines the filtering and palindrome checking in one pass
 * using two pointers,
 * making it both time-efficient and space-efficient.**
 * 
 * It uses a constant amount of space and a single loop with two pointers.
 * 
 * > 🕒 Time Complexity is linear O(n) where n is string length, since we
 * traverse the entire string once (Single pass through string) and 💾
 * Space Complexity is constant O(1) as we don’t use any extra space (modifies
 * nums in-place).
 * 
 * Runtime: 2ms Beats 99.27%
 * Memory: 43.03 MB and Beats 64.40%
 */

public class ValidPalindromeProblem {
  public static void main(String[] args) {
    ValidPalindromeProblem solution = new ValidPalindromeProblem();

    // Test cases
    String famous_example = "madam";
    String example_1 = "A man, a plan, a canal: Panama";
    String example_2 = "race a car";
    String example_3 = " ";

    // Running test cases using different methods
    System.out.println("Is famous_example 'madam' palindrome: " + solution.quickSolution(famous_example));
    System.out.println("Is " + example_1 + " is palindrome: " + solution.optimalSolutionUsingInPlaceTwoPointer(example_1));
    System.out.println("Is " + example_2 + " is palindrome: " + solution.optimalSolutionUsingInPlaceTwoPointer(example_2));
    System.out.println("Is " + example_3 + " is palindrome: " + solution.optimalSolutionUsingInPlaceTwoPointer(example_3));
  }

  public boolean quickSolution(String s) {
    String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
  }

  public boolean bruteForce(String s) {
    StringBuilder cleaned = new StringBuilder();

    // Clean the string
    for (char c : s.toCharArray()) {
      if (Character.isLetterOrDigit(c)) {
        cleaned.append(Character.toLowerCase(c));
      }
    }

    // Check for palindrome
    String reversed = cleaned.reverse().toString();
    return cleaned.toString().equals(reversed);
  }

  public boolean subOptimalSolutionUsingRecursive(String s) {
    return subOptimalIsPalindromeRecursive(s, 0, s.length() - 1); // O(n) space for recursion stack
  }

  private boolean subOptimalIsPalindromeRecursive(String s, int left, int right) {
    // Base case
    if (left >= right)
      return true; // O(1) time

    // Skip non-alphanumeric characters
    while (left < right && !Character.isLetterOrDigit(s.charAt(left))) { // O(1) time per char
      left++;
    }
    while (left < right && !Character.isLetterOrDigit(s.charAt(right))) { // O(1) time per char
      right--;
    }

    // Compare characters
    if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) { // O(1) time
      return false;
    }

    // Recursive call
    return subOptimalIsPalindromeRecursive(s, left + 1, right - 1); // O(n) recursive calls
  }

  public boolean optimalSolutionUsingInPlaceTwoPointer(String s) {
    if (s == null || s.length() == 0)
      return true; // O(1) time & space

    int left = 0, right = s.length() - 1; // O(1) space

    while (left < right) { // O(n) time
      // Find next valid character from left
      while (left < right && !Character.isLetterOrDigit(s.charAt(left))) { // O(1) time per char
        left++;
      }

      // Find next valid character from right
      while (left < right && !Character.isLetterOrDigit(s.charAt(right))) { // O(1) time per char
        right--;
      }

      // Compare characters
      if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) { // O(1) time
        return false;
      }

      left++;
      right--;
    }
    return true;
  }
}

/**
 * javac leet_code/string/easy/valid_palindrome/ValidPalindromeProblem.java &&
 * java leet_code/string/easy/valid_palindrome/ValidPalindromeProblem
 */
