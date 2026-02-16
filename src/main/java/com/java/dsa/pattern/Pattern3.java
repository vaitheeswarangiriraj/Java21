package com.java.dsa.pattern;

public class Pattern3 {
    static void main(String[] args) {
        int n = 5;
        if(n<=0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
