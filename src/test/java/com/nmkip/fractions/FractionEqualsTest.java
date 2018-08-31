package com.nmkip.fractions;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotSame;

public class FractionEqualsTest {

    @Test
    public void sameNumeratorAndDenominator() {
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));
    }

    @Test
    public void differentNumerators() {
        assertNotSame(new Fraction(1,5), new Fraction(2,5));
    }

    @Test
    public void differentDenominators() {
        assertNotSame(new Fraction(1,5), new Fraction(2,7));
    }

    @Test
    public void wholeNumberEqualsSameFraction() {
        assertEquals(new Fraction(5, 1), new Fraction(5));
    }

    @Test
    public void wholeNUmberNotEqualToDifferentWholeNumber() {
        assertNotSame(new Fraction(6), new Fraction(5));
    }

    @Test
    public void negativeDenominator() {
        assertEquals(new Fraction(1, 2), new Fraction(-1, -2));
        assertEquals(new Fraction(-1, 2), new Fraction(1, -2));
    }
}
