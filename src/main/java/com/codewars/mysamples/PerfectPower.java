package com.codewars.mysamples;

import java.util.Arrays;

public class PerfectPower {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(isPerfectPower((int)Math.pow(12, 5))));
    }

    public static int[] isPerfectPower(int n) {
        int m = 0;
        int k = 0;
        while (++m < Math.sqrt(n)) {
            k = (int) Math.round(Math.log(n) / Math.log(m));
            if (Math.pow(m, k) == n) return new int[] {m, k};
        }
        return null;
    }
}
