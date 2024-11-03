package leet_code.palindrome.tests;

import leet_code.string.easy.valid_palindrome.*;;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidPalindromeProblemTest {
    private final ValidPalindromeProblem solution = new ValidPalindromeProblem();

    @Test
    public void testValidPalindrome() {
        assertTrue(solution.quickSolution("A man, a plan, a canal: Panama"));
        assertTrue(solution.bruteForce(" "));
        assertTrue(solution.bruteForce("a"));
        assertTrue(solution.subOptimalSolutionUsingRecursive("AbBa"));
        assertTrue(solution.optimalSolutionUsingInPlaceTwoPointer("12321"));
        assertTrue(solution.optimalSolutionUsingInPlaceTwoPointer("A1b22b1a"));
    }

    @Test
    public void testInvalidPalindrome() {
        assertFalse(solution.optimalSolutionUsingInPlaceTwoPointer("race a car"));
        assertFalse(solution.optimalSolutionUsingInPlaceTwoPointer("This is not a palindrome"));
    }

    @Test
    public void testAllNonAlphanumeric() {
        assertTrue(solution.optimalSolutionUsingInPlaceTwoPointer(".,;:!@#$%^&*()"));
    }
}