package com.java.dsa.pattern;

public class Pattern9 {
    static void main(String[] args) {
        int n = 4;
        if(n<=0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n-i));
            System.out.println("*".repeat(i*2-1));
        }
        for (int i = n; i >= 1; i--) {
            System.out.print(" ".repeat(n-i));
            System.out.println("*".repeat(i*2-1));
        }

    }
}
