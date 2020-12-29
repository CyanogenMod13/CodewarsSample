//https://www.codewars.com/kata/55e2adece53b4cdcb900006c/train/java
package com.codewars.mysamples;

public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2) return null;
        int[] result = new int[3];
        int time = 3600 * g / (v2 - v1);
        int divisor = 3600;
        for (int i = 0; i < result.length; i++) {
            result[i] = time / divisor % 60;
            divisor /= 60;
        }
        return result;
    }
}
