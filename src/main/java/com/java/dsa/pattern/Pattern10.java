package com.java.dsa.pattern;

public class Pattern10 {
    static void main(String[] args) {
        int n = 4;
        if(n<=0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 1; i <n ; i++) {
            System.out.println("*".repeat(i));
        }
        for (int i = n; i >= 1; i--) {
            System.out.println("*".repeat(i));
        }

    }
}
