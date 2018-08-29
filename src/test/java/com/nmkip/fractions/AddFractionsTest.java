package com.nmkip.fractions;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AddFractionsTest {

    @Test
    public void zeroPlusZero() {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue());
    }
}
