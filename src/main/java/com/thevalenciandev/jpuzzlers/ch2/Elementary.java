package com.thevalenciandev.jpuzzlers.ch2;

public class Elementary {

    public static void main(String[] args) {
        System.out.println(12345 + 5432l); // bad. 17777: Avoid using l (el), to mark a Long, it's confusing!
        System.out.println(12345 + 54321L); // good.
    }
}
