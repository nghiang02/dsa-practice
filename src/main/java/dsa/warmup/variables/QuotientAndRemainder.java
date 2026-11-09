package dsa.warmup.variables;


/**
 * Lesson: Quotient and Remainder of a Division – https://algomaster.io/learn/dsa/quotient-and-remainder – Easy
 * Test case: (-7,2) (5,0)
 * Approach 1: Integer Division and Modulo
 * Note: n % 2 == 1 to check for odd numbers fails when n is negative
 */
public class QuotientAndRemainder {
    public static int[] divide(int dividend, int divisor) {
        return new int[] {dividend/divisor, dividend%divisor};
    }
}
