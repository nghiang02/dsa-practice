package dsa.warmup.variables;

/**
 * Lesson:Temperature Converter – https://algomaster.io/learn/dsa/temperature-converter – Easy
 * Test case: temp = 100 scale = "C" -> 212.00
 * Approach 1:  Apply the Conversion Formula
 * Note: integer division 9/5 is 1 not 1.8
 */

public class TemperatureConverter {
    public static double convert(double temp, String scale) {

        if (scale.equals("C")) {
            return Math.round((temp * 9 / 5 + 32) * 100) / 100.0;
        }
        return Math.round(((temp - 32) * 5 / 9) * 100) / 100.0;
    }
}
