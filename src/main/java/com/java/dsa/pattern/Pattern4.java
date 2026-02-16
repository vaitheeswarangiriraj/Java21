package com.java.dsa.pattern;

public class Pattern4 {
    static void main(String[] args) {
        int n = 5;
        if(n<=0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
