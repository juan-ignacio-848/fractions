package com.nmkip.fractions;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AddFractionsTest {

    @Test
    public void zeroPlusZero() {
        assertEquals(new Fraction(0), new Fraction(0).plus(new Fraction(0)));
    }

    @Test
    public void nonZeroPlusZero() {
        assertEquals(new Fraction(3), new Fraction(3).plus(new Fraction(0)));
    }

    @Test
    public void zeroPlusNonZero() {
        assertEquals(new Fraction(5), new Fraction(0).plus(new Fraction(5)));
    }

    @Test
    public void nonNegativeNonZeroOperands() {
        assertEquals(new Fraction(7), new Fraction(3).plus(new Fraction(4)));
    }

    @Test
    public void negativeInputsAndNegativeOutputs() {
        assertEquals(new Fraction(-2), new Fraction(-3).plus(new Fraction(1)));
    }

    @Test
    public void nonTrivialButCommonDenominator() {
        assertEquals(new Fraction(3,5), new Fraction(1, 5).plus(new Fraction(2, 5)));
    }

    @Test
    public void differentDenominatorsWithoutReducing() {
        assertEquals(new Fraction(5,6), new Fraction(1,2).plus(new Fraction(1, 3)));
    }

    @Test
    public void reduceResultToWholeNumber() {
        assertEquals(new Fraction(1), new Fraction(1, 3).plus(new Fraction(2, 3)));
    }

    @Test
    public void oneDenominatorIsAMultipleOfTheOther() {
        assertEquals(new Fraction(11, 8), new Fraction(3, 4).plus(new Fraction(5, 8)));
    }

    @Test
    public void commonFactorInDenominators() {
        assertEquals(new Fraction(11, 18), new Fraction(1, 6).plus(new Fraction(4, 9)));
    }

    @Test
    public void reduceResultEvenWhenDenominatorsAreTheSame() {
        assertEquals(new Fraction(3,2), new Fraction(3,4).plus(new Fraction(3, 4)));
    }

    @Test
    public void negativeFractionAndReducing() {
        assertEquals(new Fraction(1, 2), new Fraction(-1, 4).plus(new Fraction(3, 4)));
        assertEquals(new Fraction(-1, 8), new Fraction(3, 8).plus(new Fraction(-1, 2)));
    }

    @Test
    public void negativeSignsEverywhere() {
        assertEquals(new Fraction(1, 2), new Fraction(1, -4).plus(new Fraction(-3, -4)));
    }
}
