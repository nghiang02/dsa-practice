package dsa.warmup.conditionals;

/**
 * Lesson: Leap Year Check – https://algomaster.io/learn/dsa/leap-year-check – Easy
 * Pattern: Warmup
 *
 * Understand: input = int year, output = true if leap year, else false
 * Test cases:
 *   - example: year = 1900 -> false
 *   - normal:  ... -> ...
 *   - edge:    ... -> ...
 *
 * Approach 1: ... – O(1) time, O(1) space
 *
 * Note:
 */
public class LeapYearCheck {

    public static boolean isLeapYear(int year) {
        // TODO
        return year % 4 == 0 && ( year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));   // expected: false
        // add your normal and edge cases here
    }
}
