package leet_code.two_sum;
/**
 * # Two Sum (Easy)

## Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

## Examples

### Example 1

**Input:**  
`nums = [2, 7, 11, 15]`  
`target = 9`  

**Output:**  
`[0, 1]`  

**Explanation:**  
Because `nums[0] + nums[1] == 9`, we return `[0, 1]`.

---

### Example 2

**Input:**  
`nums = [3, 2, 4]`  
`target = 6`  

**Output:**  
`[1, 2]`  

---

### Example 3

**Input:**  
`nums = [3, 3]`  
`target = 6`  

**Output:**  
`[0, 1]`  

## Constraints

- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Only one valid answer exists.
 */


import java.util.HashMap;

public class TwoSumProblem {
    public static void main(String[] args) {
        TwoSumProblem ts = new TwoSumProblem();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        System.out.println("Brute Force Approach:");
        printResult(ts.twoSumBruteForce(nums, target));
        
        System.out.println("Suboptimal Approach:");
        printResult(ts.twoSumSuboptimal(nums, target));
        
        System.out.println("Optimal Approach:");
        printResult(ts.twoSumOptimal(nums, target));
    }
    
    // Brute Force Approach
    public int[] twoSumBruteForce(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
    
    // Suboptimal Approach (Two-pass Hash Table)
    public int[] twoSumSuboptimal(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // First pass: Build the hash table
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        // Second pass: Check for complement
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        
        return new int[]{}; // No solution found
    }
    
    // Optimal Approach (One-pass Hash Table)
    public int[] twoSumOptimal(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        
        return new int[]{}; // No solution found
    }
    
    private static void printResult(int[] result) {
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}
/**
 * Command to Run:  
 * 
```
javac leet_code/two_sum/TwoSumProblem.java  && java leet_code.two_sum.TwoSumProblem
```
 */