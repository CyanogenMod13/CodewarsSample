package com.codewars.mysamples;

import org.junit.Assert;
import org.junit.Test;

public class BreakCamelCaseTest {
    @Test
    public void test() {
        Assert.assertEquals("Hello World", BreakCamelCase.camelCase("HelloWorld"));
        Assert.assertEquals("Helloworld", BreakCamelCase.camelCase("Helloworld"));
        Assert.assertEquals("helloworld", BreakCamelCase.camelCase("helloworld"));
    }
}
