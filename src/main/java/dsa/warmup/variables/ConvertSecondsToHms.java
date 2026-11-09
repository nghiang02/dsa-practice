package dsa.warmup.variables;

/**
 * Lesson: Convert Seconds To Hms – https://algomaster.io/learn/dsa/convert-seconds-to-hms– Easy
 * Test case: totalSeconds = 86399 -> [23,59,59]
 * Approach : divide and take the remainder
 * Note:
 */
public class ConvertSecondsToHms {
    public static int[] secondsToHMS(int totalSeconds) {
        int hours = totalSeconds / (60*60);
        int remaining = totalSeconds % (60*60);
        int minutes = remaining / 60;
        int seconds = remaining % 60;
        return new int[]{hours,minutes,seconds};
    }
}
