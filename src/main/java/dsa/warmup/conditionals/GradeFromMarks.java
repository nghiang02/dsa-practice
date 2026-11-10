package dsa.warmup.conditionals;

/**
 * Lesson: Grade from Marks – https://algomaster.io/learn/dsa/grade-from-marks – Easy
 * Pattern: Warmup
 *
 * Understand: input = int marks (0..100), output = "A", "B", "C", "D" or "F"
 * Test cases:
 *   - example: marks = 72 -> "C"
 *   - normal:  ... -> ...
 *   - edge:    ... -> ...
 *
 * Approach 1: Else-If – O(1) time, O(1) space
 *
 * Note:
 */
public class GradeFromMarks {

    public static String grade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        System.out.println(grade(72));   // expected: C
        // add your normal and edge cases here
    }
}
