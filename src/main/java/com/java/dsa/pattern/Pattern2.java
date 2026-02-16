package com.java.dsa.pattern;

public class Pattern2 {
    static void main(String[] args) {
        int n = 5;
        if(n<=0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 1; i <= n; i++) {
                System.out.println(("*").repeat(i));
        }
    }
}
