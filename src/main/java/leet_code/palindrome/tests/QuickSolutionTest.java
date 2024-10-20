package leet_code.palindrome.tests;

import leet_code.palindrome.QuickSolution;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSolutionTest {
    private final QuickSolution solution = new QuickSolution();

    @Test
    public void testValidPalindrome() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(solution.isPalindrome(" "));
        assertTrue(solution.isPalindrome("a"));
        assertTrue(solution.isPalindrome("AbBa"));
        assertTrue(solution.isPalindrome("12321"));
        assertTrue(solution.isPalindrome("A1b22b1a"));
    }

    @Test
    public void testInvalidPalindrome() {
        assertFalse(solution.isPalindrome("race a car"));
        assertFalse(solution.isPalindrome("This is not a palindrome"));
    }

    @Test
    public void testAllNonAlphanumeric() {
        assertTrue(solution.isPalindrome(".,;:!@#$%^&*()"));
    }
}