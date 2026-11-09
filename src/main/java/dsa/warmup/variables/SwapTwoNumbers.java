package dsa.warmup.variables;

/**
 * Lesson: Swap Two Numbers – https://algomaster.io/learn/dsa/swap-two-numbers – Easy
 * Test case: (3, 5), (-2, 7), (MAX_VALUE, 1), a == b
 * Approach 1: temporary variable – O(1) time, O(1) space
 * Approach 2: a = a + b; b = a - b; a = a - b or a ^= a; b ^= a ; a ^= b – correct for int despite overflow (Java), but WRONG when both refer to the same memory slot
 * Note: always use a temp variable
 */
public class SwapTwoNumbers {
    public static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }
}
