package dsa.warmup.conditionals;

/**
 * Lesson: Positive, Negative, or Zero – https://algomaster.io/learn/dsa/positive-negative-or-zero – Easy
 * Pattern: Warmup
 *
 * Understand: input = int n, output = "Positive", "Negative" or "Zero"
 * Test cases:
 *   - example: n = 0 -> "Zero"
 * Approach 1: If Else – O(1) time, O(1) space
 *
 * Note:
 */
public class PositiveNegativeOrZero {

    public static String classify(int n) {
        if ( n > 0 ) return "Positive";
        else if ( n == 0) return "Zero";
        return "Negative";
    }

    public static void main(String[] args) {
        System.out.println(classify(0));   // expected: Zero
        // add your normal and edge cases here
    }
}
