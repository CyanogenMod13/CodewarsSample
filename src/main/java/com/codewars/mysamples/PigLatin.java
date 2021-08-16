package com.codewars.mysamples;

import com.codewars.mysamples.annotation.URLKata;

@URLKata("https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java")
public class PigLatin {
    public static String pigIt(String str) {
        StringBuilder builder = new StringBuilder();
        for (String s : str.split("\\s")) {
            if (builder.length() > 0)
                builder.append(' ');
            builder.append(s.substring(1)).append(s.charAt(0)).append("ay");
        }
        return builder.toString();
    }
}
