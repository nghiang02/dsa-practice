package dsa.warmup.variables;

/**
 * Lesson: Simple Interest and Compound Interest – https://algomaster.io/learn/dsa/simple-and-compound-interest – Easy
 * Pattern: Warmup
 *
 * Understand: input = double principal (>0), double rate (% per year, >=0), int time (years, >=0), output = [simpleInterest, compoundInterest], each rounded to 2 decimals
 * Test cases:
 *   - example: (1000, 5, 2) -> [100.00, 102.50]
 *   - normal:  (800, 7, 4) -> [224,248.64]
 *   - edge:    (2000,0,5) -> [0,0] , (1500,6,0) -> [0,0]
 *
 * Approach 1: Apply the Interest Formulas – O(time) time, O(1) space
 *
 * Note: use Math.pow - O(1) time complexity
 */
public class SimpleAndCompoundInterest {

    public static double[] interest(double principal, double rate, double time) {
        int years = (int) time;
        double simpleInterest = Math.round((principal * rate * time / 100.0)*100)/100.0;
        double factor = 1.0;
        for (int year = 0; year < years; year++) {
            factor = factor * (1.0 + rate/100.0);
        }
        double compoundInterest =  Math.round((principal * factor - principal)*100)/100.0;
        return new double[]{simpleInterest,compoundInterest};
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(interest(1000, 5, 2)));   // expected: [100.0, 102.5]
        // add your normal and edge cases here
    }
}
