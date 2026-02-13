package com.java.array;

public class PrintingArray {
    public static void main(String[] args) {
        int[] ia1 = {0, 1, 2, 3};
        int[] ia2 = {10, 20, 30, 40};
        int[] ia = ia1;

        // What if we did this?
        System.out.println(ia[(ia = ia2)[0]]);
    }
}
