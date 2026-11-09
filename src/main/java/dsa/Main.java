package dsa;

import dsa.warmup.variables.*;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(SwapTwoNumbers.swap(4,5)));
        System.out.println(TemperatureConverter.convert(100, "C"));

        System.out.println(Arrays.toString(ConvertSecondsToHms.secondsToHMS(86500)));
    }
}