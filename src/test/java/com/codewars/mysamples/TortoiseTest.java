package com.codewars.mysamples;

import org.junit.Assert;
import org.junit.Test;

public class TortoiseTest {
    @Test
    public void test() {
        Assert.assertArrayEquals(new int[]{0, 32, 18}, Tortoise.race(720, 850, 70));
    }
}
