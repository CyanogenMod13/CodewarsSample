package com.codewars.mysamples;

import com.codewars.mysamples.annotation.URLKata;

@URLKata("https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java")
public class Snail {
    public static int[] snail(int[][] array) {
        if (array[0].length == 0) return new int[0];
        if (array[0].length == 1) return new int[] { array[0][0] };

        int[] result = new int[array.length * array.length];
        int[] position = {0, 0};
        int len = array.length;
        int currentLen = 1;
        int increment = 1;
        int index = 1;

        for (int i = 0; i < result.length; i++) {
            result[i] = array[position[0]][position[1]];

            if (currentLen++ == len) {
                if (index == 1) {
                    currentLen = 2;
                    index--;
                } else {
                    index++;
                    currentLen = 1;
                    len--;
                    increment *= -1;
                }
            }

            position[index] += increment;
        }
        return result;
    }
}
