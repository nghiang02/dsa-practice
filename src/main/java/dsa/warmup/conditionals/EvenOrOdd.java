package dsa.warmup.conditionals;

/**
 * Lesson: Even or Odd – https://algomaster.io/learn/dsa/even-or-odd – Easy
 * Pattern: Warmup
 *
 * Understand: input = int n, output = "Even" or "Odd"
 * Test cases:
 *   - example: n = -3 -> "Odd"
 * Approach 1: Modulo  O(1) time, O(1) space
 * Note: avoid the trap n % 2 == 1
 */
public class EvenOrOdd {

    public static String evenOrOdd(int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(-3));   // expected: Odd
        // add your normal and edge cases here
    }
}
