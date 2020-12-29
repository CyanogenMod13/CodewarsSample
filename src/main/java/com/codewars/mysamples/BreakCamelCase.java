//https://www.codewars.com/kata/5208f99aee097e6552000148/train/java
package com.codewars.mysamples;

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
