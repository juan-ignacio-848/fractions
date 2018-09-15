package com.nmkip.fractions;

public class NumberTheory {

    public static int gcd(int a, int b) {
        if(a == 0 && b == 0) {
            return 1;
        }

        while (b != 0) {
            int t = b;
            b = a % t;
            a = t;
        }
        return Math.abs(a);
    }

}
