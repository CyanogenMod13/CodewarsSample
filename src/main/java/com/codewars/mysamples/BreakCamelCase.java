package com.codewars.mysamples;

import com.codewars.mysamples.annotation.URLKata;

@URLKata("https://www.codewars.com/kata/5208f99aee097e6552000148/train/java")
public class BreakCamelCase {
    public static String camelCase(String input) {
        StringBuilder r = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (r.length() > 0 && Character.isUpperCase(ch))
                r.append(' ');
            r.append(ch);
        }
        return r.toString();
    }
}
