package leet_code.move_zeroes;

import java.util.Arrays;

/**
* ## 283. Move Zeroes (Easy)
 * 
 * > Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 * **Example 1**:  
- Input: nums = [0,1,0,3,12]  
- Output: [1,3,12,0,0]
 * 
 * 
 * **Example 2**:  
- Input: nums = [0]  
- Output: [0]
 * 
* ### Approach 1: Brute Force
 * **In this approach, we create two loops**
 * 
1. Since it's an integer array, all elements are initialized to 0 by default.  
1. Traverse & find zeros count.  
 * 
> 🕒 Time Complexity is linear O(n) since two array iteration and 💾 Space Complexity is linear O(n) but doesn't satisfy the in-place requirement, as it uses extra space.

* ### Approach 2: Two-Pointer Technique (Time Optimized)
 * **In this approach, we use two pointers**
 * 
1. Simple iteration with keep index (pointer) as 0 and increment only when it find the non zero element (One pointer iterates over each element).  
1. So basically, it will move the non zero in the start, let say from `[0,1,0,3,12]` to `[1,3,12,3,12]`. 

> 🕒 Time Complexity is linear O(n) since we traverse the array once and 💾 Space Complexity is constant O(1) since this approach is in-place.

* ### Approach 3: Optimized for Minimum Writes (Space Optimized)
 * **In this approach, swapping zero and non-zero elements only when necessary to minimize the number of writes.**
 * 
1. It is better than the two-pointer technique in terms of reducing the number of operations.
1. This is also better solution for reducing wear on memory and optimizing performance.

> 🕒 Time Complexity is linear O(n) since we traverse the array once and 💾 Space Complexity is constant O(1) as we don’t use any extra space (modifies nums in-place).
 */

public class MoveZeroesProblem {  
  public static void main (String[] args) {
    int[] nums = {1,0,0,3,12};
    System.out.println("Input: " + Arrays.toString(nums));

    MoveZeroesProblem moveZeroesProblem = new MoveZeroesProblem();

    System.out.println("\n" + "Two Pointer Force:");
    int[] bruteForceResult = moveZeroesProblem.bruteForce(nums);
    System.out.println("Output" + Arrays.toString(bruteForceResult));

    System.out.println("\n" + "Two Pointer Technique:");
    int[] timeOptimizedResult = moveZeroesProblem.twoPointerTechnique(nums);
    System.out.println("Output" + Arrays.toString(timeOptimizedResult));

    System.out.println("\n" + "Swap Technique:");
    int[] spaceOptimizedResult = moveZeroesProblem.swapTechnique(nums);
    System.out.println("Output" + Arrays.toString(spaceOptimizedResult));
  }

  public int[] bruteForce(int[] nums) {
    int count = nums.length;
    int[] nonZeroNumbers = new int[count];
    int index = 0;

    for(int num : nums) {
      if (num != 0) {
        nonZeroNumbers[index++] = num;
      }
    }

    for(int i = 0; i < count; i++) {
      nums[i] = nonZeroNumbers[i];
    }

    return nums;
  }

  public int[] twoPointerTechnique(int[] nums) {
    int index = 0;

    for(int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[index++] = nums[i];
      }
    }

    while(index < nums.length) {
      nums[index++] = 0;
    }

    return nums;
  }

  public int[] swapTechnique(int[] nums) {
    int index = 0;

    for(int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        if (i != index) {
          int temp = nums[i];
          nums[i] = nums[index];
          nums[index] = temp;
        }
      }

      index++;
    }
    return nums;
  }
}

/**
 * Command to Run:  
 * 
```
javac leet_code/move_zeroes/MoveZeroesProblem.java  && java leet_code/move_zeroes/MoveZeroesProblem
```
 */
