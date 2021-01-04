package com.codewars.mysamples;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SnailTest {
    @Test
    public void test() {
        int[][] array = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        int[] a = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        Assert.assertArrayEquals(a, Snail.snail(array));
    }

    @Test
    public void test1() {
        int[][] array = {
                {1, 2, 3, 1},
                {4, 5, 6, 4},
                {7, 8, 9, 7},
                {7, 8, 9, 7}
        };
        int[] a = {1, 2, 3, 1, 4, 7, 7, 9, 8, 7, 7, 4, 5, 6, 9, 8};
        Assert.assertArrayEquals(a, Snail.snail(array));
    }
}
