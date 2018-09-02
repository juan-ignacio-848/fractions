package com.nmkip.fractions;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MultiplyFractionsTest {

    @Test
    public void zeroTimesZero() {
        assertEquals(new Fraction(0), new Fraction(0).times(new Fraction(0)));
    }

    @Test
    public void nonZeroTimesZero() {
        assertEquals(new Fraction(0), new Fraction(1).times(new Fraction(0)));
    }

    @Test
    public void zeroTimesNonZero() {
        assertEquals(new Fraction(0), new Fraction(0).times(new Fraction(1)));
    }

    @Test
    public void oneTimesOne() {
        assertEquals(new Fraction(1), new Fraction(1).times(new Fraction(1)));
    }

    @Test
    public void negativeTwoTimesOne() {
        assertEquals(new Fraction(-2), new Fraction(-2).times(new Fraction(1)));
    }

    @Test
    public void nonOneDenominatorTimesOne() {
        assertEquals(new Fraction(1, 2), new Fraction(1, 2).times(new Fraction(1)));
    }
}
