package com.codewars.mysamples;

import org.junit.Assert;
import org.junit.Test;

public class RankingSystemTest {
    @Test
    public void test1() {
        RankingSystem user = new RankingSystem();
        user.incProgress(-7);
        Assert.assertEquals(10, user.progress);
        user.incProgress(-5); // will add 90 progress
        Assert.assertEquals(0, user.progress); // => 0 // progress is now zero
        Assert.assertEquals(-7, user.rank); // => -7 // rank was upgraded to -7
    }

    @Test
    public void test2() {
        RankingSystem user = new RankingSystem();
        Assert.assertThrows(IllegalArgumentException.class, () -> user.incProgress(9));
        Assert.assertThrows(IllegalArgumentException.class, () -> user.incProgress(-19));
        Assert.assertThrows(IllegalArgumentException.class, () -> user.incProgress(0));
    }

    @Test
    public void test3() {
        RankingSystem user = new RankingSystem();
        user.incProgress(8);
        Assert.assertEquals(8, user.rank);
    }
}
