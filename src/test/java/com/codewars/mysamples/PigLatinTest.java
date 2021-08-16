package com.codewars.mysamples;
import static org.junit.Assert.*;
import org.junit.Test;

public class PigLatinTest {
    @Test
    public void test() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string !"));
    }
}
