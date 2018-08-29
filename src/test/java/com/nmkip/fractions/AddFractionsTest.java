package com.nmkip.fractions;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AddFractionsTest {

    @Test
    public void zeroPlusZero() {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue());
    }

    @Test
    public void nonZeroPlusZero() {
        final Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(3, sum.intValue());
    }

    @Test
    public void zeroPlusNonZero() {
        final Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(5, sum.intValue());
    }
}
