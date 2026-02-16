package com.java.dsa.pattern;

public class Pattern8 {
    static void main(String[] args) {
        int n = 4;
        if(n<=0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = n; i >= 1; i--) {
            System.out.print(" ".repeat(n-i));
            System.out.println("*".repeat(i*2-1));
        }
    }
}
