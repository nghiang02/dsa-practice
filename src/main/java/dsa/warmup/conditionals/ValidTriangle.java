package dsa.warmup.conditionals;

/**
 * Lesson: Valid Triangle from Three Sides – https://algomaster.io/learn/dsa/valid-triangle-from-three-sides – Easy
 * Pattern: Warmup
 *
 * Understand: input = double a, b, c (positive), output = true if they form a valid triangle
 * Test cases:
 *   - example: (1, 1, 2) -> false
 *   - normal:  ... -> ...
 *   - edge:    ... -> ...
 *
 * Approach 1: ... – O(?) time, O(?) space
 *
 * Note:
 */
public class ValidTriangle {
    private static final double EPS = 1e-9;
    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c + EPS) && (b + c > a +  EPS) && (a + c > b + EPS);
    }

    public static void main(String[] args) {
        System.out.println(isValidTriangle(0.1, 0.2, 0.3));   // expected: false
        // add your normal and edge cases here
    }
}
