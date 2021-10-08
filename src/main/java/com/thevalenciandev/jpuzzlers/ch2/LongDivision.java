package com.thevalenciandev.jpuzzlers.ch2;

public class LongDivision {

    public static void main(String[] args) {
        //final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000; // 86,400,000,000 (overflows integer if we don't add the L!)
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000; // 86,400,000,000 (overflows integer if we don't add the L!)
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000; // doesn't overflow
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }
}
