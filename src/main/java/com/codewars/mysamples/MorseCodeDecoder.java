package com.codewars.mysamples;

import com.codewars.mysamples.annotation.URLKata;

import java.util.HashMap;
import java.util.Map;

@URLKata("https://www.codewars.com/kata/54b724efac3d5402db00065e/train/java")
public class MorseCodeDecoder {
    public static String decode(String codeMorse) {
        if (codeMorse.isBlank()) return "";
        StringBuilder result = new StringBuilder();
        for (String code : codeMorse.trim().split(" [ ]?")) {
            result.append(code.isEmpty() ? " " : MorseCode.get(code));
        }
        return result.toString();
    }
    public static class MorseCode {
        private static final Map<String, String> codes = new HashMap<>();
        private static final String[][] arr = {
                {"...---...", "SOS"},
                {".", "E"},
                {"....", "H"},
                {"-.--", "Y"},
                {".---", "J"},
                {"..-", "U"},
                {"-..", "D"}
        };
        static {
            for (String[] code : arr) {
                codes.put(code[0], code[1]);
            }
        }
        public static String get(String code) {
            return codes.get(code);
        }
    }
}
