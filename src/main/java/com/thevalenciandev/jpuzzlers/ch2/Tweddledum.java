package com.thevalenciandev.jpuzzlers.ch2;

public class Tweddledum {

    public static void main(String[] args) {
        short x = 0;
        int i = 123456;
        x += i; // hidden cast to ""fit"" the int into a short, which removes the 2 high-order bytes from the i
        System.out.println(x); // prints -7616!
//        x = x + i; // This will *not* compile, though, which is better.
    }
}
