package com.codewars.mysamples;

import org.junit.Assert;
import org.junit.Test;

public class MorseCodeDecoderTest {
    @Test
    public void blankString() {
        Assert.assertEquals("", MorseCodeDecoder.decode(""));
        Assert.assertEquals("", MorseCodeDecoder.decode("   "));
    }

    @Test
    public void singleLetter() {
        Assert.assertEquals("E", MorseCodeDecoder.decode("."));
    }

    @Test
    public void singleWord() {
        Assert.assertEquals("HEY", MorseCodeDecoder.decode("  .... . -.-- "));
        Assert.assertEquals("HEY", MorseCodeDecoder.decode(".... . -.--"));
    }

    @Test
    public void testString() {
        Assert.assertEquals("HEY JUDE", MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
    }

    @Test
    public void randomTest() {
        //fill me!
    }
}
