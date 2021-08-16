package com.codewars.mysamples;

public class Fracts {

    public static void main(String[] args) {
        //convertFrac(new long[][] { {1, 2}, {1, 3}, {10, 40} });
        //System.out.println(gcd(300000000, 2));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

    }

    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static String convertFrac(long[][] list) {
        StringBuilder builder = new StringBuilder();
        for (long[] pair : list) {
            long gcd = gcd(pair[0], pair[1]);
            pair[0] = pair[0] / gcd;
            pair[1] = pair[1] / gcd;
        }
        long lcm = 1;
        for (long[] pair : list) {
            lcm = lcm(lcm, pair[1]);
        }
        for (long[] pair : list) {
            builder.append(String.format("(%d,%d)", lcm / pair[1] * pair[0], lcm));
        }
        return builder.toString();
    }
}
