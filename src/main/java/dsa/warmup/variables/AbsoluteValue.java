package dsa.warmup.variables;


/**
 * Lesson: Absolute Value Without Built-in– https://algomaster.io/learn/dsa/absolute-value– Easy
 * Test case: Integer.MIN_VALUE -> Integer.MIN_VALUE
 * Approach 1: Conditional negation
 * Approach 2: Bit Manipulation
 * In two’s complement, -n == ~n + 1. The mask trick does “flip, then +1” only when n is negative and does nothing otherwise. That’s how one expression covers both cases without a branch.
 * Note:
 */


public class AbsoluteValue {
    public static int absoluteValueWithCondition(int n) {
        if (n > 0) return n;
        return -n;
    }
    public static int absoluteValueWithBitManipulation(int n) {
        // Arithmetic shift: -1 (all 1s) for negatives, 0 otherwise
        int mask = n >> 31;
        // XOR flips bits when mask is -1; subtracting mask adds 1
        return (n^mask) - mask;
    }
}
