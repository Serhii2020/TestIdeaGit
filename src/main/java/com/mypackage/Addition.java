package com.mypackage;

public class Addition {
    public static void main(String... pars) {
        int a = 5;
        int b = 6;
        add(a, b);
    }

    // addition
    private static void add(int x, int y) {
        System.out.println(x + y);
        System.out.println();
    }
}