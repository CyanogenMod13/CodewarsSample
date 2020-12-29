package com.codewars.mysamples;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        StringBuilder builder = new StringBuilder();
        int time = seconds / 3600;

        if (time < 10) builder.append('0');
        builder.append(time);

        int divisor = 60;
        for (int i = 0; i < 2; i++) {
            builder.append(':');

            time = seconds / divisor % 60;

            if (time < 10) builder.append('0');
            builder.append(time);

            divisor /= 60;
        }
        return builder.toString();
    }
}
