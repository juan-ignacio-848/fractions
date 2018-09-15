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

    @Test
    public void oneTimesNonOneDenominator() {
        assertEquals(new Fraction(1, 3), new Fraction(1).times(new Fraction(1, 3)));
    }

    @Test
    public void nonOneWholeNumberTimesNonOneDenominator() {
        assertEquals(new Fraction(2, 3), new Fraction(2).times(new Fraction(1, 3)));
    }

    @Test
    public void nonOneDenominatorTimesNonOneWholeNumber() {
        assertEquals(new Fraction(2, 5), new Fraction(1, 5).times(new Fraction(2)));
    }

    @Test
    public void oneNumeratorAndNonOneDenominator() {
        assertEquals(new Fraction(1, 4), new Fraction(1, 2).times(new Fraction(1, 2)));
    }

    @Test
    public void nonOneNumeratorNonOneDenominator() {
        assertEquals(new Fraction(4, 21), new Fraction(2, 3).times(new Fraction(2, 7)));
    }
}
