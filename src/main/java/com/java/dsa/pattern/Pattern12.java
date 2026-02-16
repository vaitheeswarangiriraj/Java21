package com.java.dsa.pattern;

public class Pattern12 {
    static void main(String[] args) {
        int n = 4;
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 1; i <= n * 2; i++) {
            for (int j = 1; j <=n; j++) {
                if(i<=j) {
                    System.out.print(j);
                }
                if (i > j) {
                    System.out.print(" ".repeat(Math.max(((n * 2) - (i * 2)), 0)));
                }
            }
            System.out.println();
//            for (int j = n; j >=1 ; j--) {
//                if(j<i && ) {
//                    System.out.println(j);
//                }
//
//            }

        }
    }
}
