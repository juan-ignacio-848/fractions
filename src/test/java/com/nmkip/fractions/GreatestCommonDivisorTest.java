package com.nmkip.fractions;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GreatestCommonDivisorTest {

    @Test
    public void oneAndOne() {
        assertEquals(1, gcd(1,1));
    }

    private int gcd(int a, int b) {
        while(b != 0) {
            int t = b;
            b = a % t;
            a = t;
        }
        return a;
    }
}
