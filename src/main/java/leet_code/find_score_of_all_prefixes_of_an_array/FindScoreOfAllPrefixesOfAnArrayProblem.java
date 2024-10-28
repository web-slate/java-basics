package leet_code.find_score_of_all_prefixes_of_an_array;

import java.util.Arrays;

/**
 * ## 2640. Find the Score of All Prefixes of an Array (Medium)
 * 
 * > We define the conversion array conver of an array arr as follows:
 * 
 * `conver[i] = arr[i] + max(arr[0..i])` where `max(arr[0..i])` is the maximum
 * value of arr[j] over 0 <= j <= i.
 * 
 * We also define the score of an array arr as the sum of the values of the
 * conversion array of arr.
 * 
 * Given a 0-indexed integer array nums of length n, return an array ans of
 * length n where ans[i] is the score of the prefix nums[0..i].
 * 
 * **Example 1**:
 * - Input: nums = [2,3,7,5,10]
 * - Output: [4,10,24,36,56]
 * 
 * 
 * For the prefix [2], the conversion array is [4] hence the score is 4
 * For the prefix [2, 3], the conversion array is [4, 6] hence the score is 10
 * For the prefix [2, 3, 7], the conversion array is [4, 6, 14] hence the score
 * is 24
 * For the prefix [2, 3, 7, 5], the conversion array is [4, 6, 14, 12] hence the
 * score is 36
 * For the prefix [2, 3, 7, 5, 10], the conversion array is [4, 6, 14, 12, 20]
 * hence the score is 56
 * 
 * **Example 2**:
 * - Input: nums = [1,1,2,4,8,16]
 * - Output: [2,4,8,16,32,64]
 * 
 * 
 * For the prefix [1], the conversion array is [2] hence the score is 2
 * For the prefix [1, 1], the conversion array is [2, 2] hence the score is 4
 * For the prefix [1, 1, 2], the conversion array is [2, 2, 4] hence the score
 * is 8
 * For the prefix [1, 1, 2, 4], the conversion array is [2, 2, 4, 8] hence the
 * score is 16
 * For the prefix [1, 1, 2, 4, 8], the conversion array is [2, 2, 4, 8, 16]
 * hence the score is 32
 * For the prefix [1, 1, 2, 4, 8, 16], the conversion array is [2, 2, 4, 8, 16,
 * 32] hence the score is 64
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 109
 * 
 * ### Approach 1: Brute Force
 * **In this approach, time limit will be exceeded in leet code.
 * 
 * 1. Solution involves calculating the conversion array for each prefix.  
 * 1. Each prefix by iterating through all elements up to the current index.  
 * 1. Current index to find the maximum value. Then, we compute the score for that prefix.
 * 
 * 
 * > 🕒 Time Complexity is Quadratic O(n²) (Outer Loop: O(n) and Inner Loop: O(i) for finding the maximum and calculating the score).
 * and 💾 Space Complexity is linear O(n) for for storing the result array ans.
 * 
 * ### Approach 2: Two-Pointer Technique (Sub Optimal)
 * **In this approach, we use two pointers**
 * 
 * 1. Simple iteration with keep index (pointer) as 0 and increment only when it
 * find the non zero element (One pointer iterates over each element).
 * 1. So basically, it will move the non zero in the start, let say from
 * `[0,1,0,3,12]` to `[1,3,12,3,12]`.
 * 
 * > 🕒 Time Complexity is linear O(n) since we traverse the array once and 💾
 * Space Complexity is constant O(1) since this approach is in-place.
 * 
 * ### Approach 3: Optimized for Minimum Writes (Space Optimized)
 * **In this approach, swapping zero and non-zero elements only when necessary
 * to minimize the number of writes.**
 * 
 * 1. It is better than the two-pointer technique in terms of reducing the
 * number of operations.
 * 1. This is also better solution for reducing wear on memory and optimizing
 * performance.
 * 
 * > 🕒 Time Complexity is linear O(n) since we traverse the array once and 💾
 * Space Complexity is constant O(1) as we don’t use any extra space (modifies
 * nums in-place).
 */

public class FindScoreOfAllPrefixesOfAnArrayProblem {

  public static void main(String[] args) {
    int[] nums = { 2, 3, 7, 5, 10 };
    System.out.println("Input: " + Arrays.toString(nums));

    FindScoreOfAllPrefixesOfAnArrayProblem findScoreOfAllPrefixesOfAnArrayProblem = new FindScoreOfAllPrefixesOfAnArrayProblem();

    System.out.println("\n" + "Brute Force: Calculate conversion scores for each prefix by iterating through all elements to find the maximum value.");
    long[] bruteForceResult = findScoreOfAllPrefixesOfAnArrayProblem.bruteForce(nums);
    System.out.println("Output" + Arrays.toString(bruteForceResult));

    System.out.println("\n" + "Sub Optimal: Maintain a running maximum to compute scores efficiently while iterating through the array.");
    long[] subOptimalResult = findScoreOfAllPrefixesOfAnArrayProblem.subOptimalSolution(nums);
    System.out.println("Output" + Arrays.toString(subOptimalResult));

    System.out.println("\n" + "Swap Technique: Use a single pass to accumulate scores and track the maximum value for prefixes efficiently.");
    long[] optimizedResult = findScoreOfAllPrefixesOfAnArrayProblem.subOptimalSolution(nums);
    System.out.println("Output" + Arrays.toString(optimizedResult));
  }

  public long[] bruteForce(int[] nums) {
    int n = nums.length;
    long[] ans = new long[n];

    for (int i = 0; i < n; i++) {
      long max = Long.MIN_VALUE;
      long score = 0;

      // Find max for the current prefix and calculate score
      for (int j = 0; j <= i; j++) {
        max = Math.max(max, nums[j]);
        score += nums[j] + max;
      }
      ans[i] = score;
    }

    return ans;
  }

  public long[] subOptimalSolution(int[] nums) {
    int n = nums.length;
    long[] ans = new long[n];
    long max = Long.MIN_VALUE;

    for (int i = 0; i < n; i++) {
        max = Math.max(max, nums[i]);
        ans[i] = (i == 0 ? 0 : ans[i - 1]) + nums[i] + max;
    }

    return ans;
  }

  public long[] optimalSolution(int[] nums) {
    int n = nums.length;
    long[] ans = new long[n];
    long max = 0;
    long score = 0;

    for (int i = 0; i < n; i++) {
        max = Math.max(max, nums[i]);
        score += nums[i] + max;
        ans[i] = score;
    }

    return ans;
  }
}

/**
 * Command to Run:  
 * 
```
javac leet_code/find_score_of_all_prefixes_of_an_array/FindScoreOfAllPrefixesOfAnArrayProblem.java && java leet_code.find_score_of_all_prefixes_of_an_array.FindScoreOfAllPrefixesOfAnArrayProblem
```
 */