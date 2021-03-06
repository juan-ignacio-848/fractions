package com.nmkip.fractions;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GreatestCommonDivisorTest {

    @Test
    public void reflexive() {
        assertEquals(1, NumberTheory.gcd(1, 1));
        assertEquals(2, NumberTheory.gcd(2, 2));
        assertEquals(1, NumberTheory.gcd(-1, -1));
    }

    @Test
    public void relativelyPrime() {
        assertEquals(1, NumberTheory.gcd(2, 3));
        assertEquals(1, NumberTheory.gcd(4, 7));
        assertEquals(1, NumberTheory.gcd(-2, -3));
    }

    @Test
    public void oneIsMultipleOfTheOther() {
        assertEquals(3, NumberTheory.gcd(3, 9));
        assertEquals(5, NumberTheory.gcd(5, 30));
    }

    @Test
    public void commonFactor() {
        assertEquals(2, NumberTheory.gcd(6, 8));
        assertEquals(7, NumberTheory.gcd(49, 315));
        assertEquals(4, NumberTheory.gcd(-24, -28));
    }

    @Test
    public void negatives() {
        // I'm not sure whether I like this behavior.
        // I probably prefer that GCD is always positive.
        assertEquals(4, NumberTheory.gcd(-24, 28));
        assertEquals(4, NumberTheory.gcd(24, -28));
    }

    @Test
    public void zero() {
        // LEARNING TEST
        // NOT SURE WHAT IS GOING TO HAPPEN
        assertEquals(1, NumberTheory.gcd(1, 0)); // Tried expected: 0 got 1
        assertEquals(5, NumberTheory.gcd(0, 5));
        assertEquals(1, NumberTheory.gcd(0, 0));
    }

}
