package com.thevalenciandev.jpuzzlers.ch2;

public class JoyOfHex {

    public static void main(String[] args) {
        // c in hex is 1100, which makes cafebabe a -ve number. Java does sign extension when converting the int to long
        // ie. 0xffffffffcafebabe
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabe)); // bad.
        System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL)); // good.
    }
}
