## Leet Code Problems

| Problem | Quick Solution | Brute Force | Time Optimized | Space Optimized |
|---------|----------------|-------------|----------------|-----------------|
| Palindrome | O(n) time, O(n) space. Use regex to clean string, convert to lowercase, and compare with its reverse. | O(n) time, O(n) space. Clean string by removing non-alphanumeric chars and converting to lowercase. Compare characters from start and end. | O(n) time, O(1) space. Two-pointer approach, skipping non-alphanumeric chars and doing case-insensitive comparison. | O(n) time, O(1) space. Two-pointer approach, in-place comparison without creating additional strings or character arrays. |