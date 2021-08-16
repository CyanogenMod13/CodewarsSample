package com.codewars.mysamples;

import com.codewars.mysamples.annotation.URLKata;
import com.codewars.mysamples.annotation.UncompletedKata;

import java.util.List;

@UncompletedKata
@URLKata("https://www.codewars.com/kata/55e7280b40e1c4a06d0000aa/train/java")
public class SumOfK {
    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        if (ls.size() < k) return null;
        Integer result = 0;
        for (int i = 0; i < ls.size(); i++) {
            Integer[] arr = new Integer[k];
            arr[0] = ls.get(i);
            for (int j = 1; j < arr.length; j++) {

            }
        }
        return result;
    }
}
