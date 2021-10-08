package com.thevalenciandev.jpuzzlers.ch1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OddityTest {

    @Test
    void isOddZero() {
        assertFalse(Oddity.isOdd(0));
    }

    @Test
    void isOddPositive() {
        assertTrue(Oddity.isOdd(1));
        assertFalse(Oddity.isOdd(2));
        assertTrue(Oddity.isOdd(Integer.MAX_VALUE)); // 2^32/2-1 = 2,147,483,647
        assertFalse(Oddity.isOdd(Integer.MAX_VALUE+1)); // Overflow. It wraps around to -2,147,483,648
        assertTrue(Oddity.isOdd(Integer.MAX_VALUE+2)); // -2,147,483,647
    }

    @Test
    void isOddNegative() {
        assertTrue(Oddity.isOdd(-1));
        assertFalse(Oddity.isOdd(-2));
    }

}