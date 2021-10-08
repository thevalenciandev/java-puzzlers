package com.thevalenciandev.jpuzzlers.ch2;

public class DosEquis {

    public static void main(String[] args) {
        char x = 'X';
        int i = 0;
        final int i2 = 0;
        System.out.println(true ? x : 0);
        System.out.println(false ? i : x); // bad.
        System.out.println(false ? i2 : x); // better, as i2 is a constant. But not great, really both should have same type.
    }
}
