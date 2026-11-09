package dsa;

import dsa.warmup.variables.SwapTwoNumbers;
import dsa.warmup.variables.TemperatureConverter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(SwapTwoNumbers.swap(4,5)));
        System.out.println(TemperatureConverter.convert(100, "C"));
    }
}