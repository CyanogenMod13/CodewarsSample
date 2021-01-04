//https://www.codewars.com/kata/55e7280b40e1c4a06d0000aa/train/java
package com.codewars.mysamples;

import com.codewars.mysamples.annotation.Uncompleted;

import java.util.List;

@Uncompleted
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
