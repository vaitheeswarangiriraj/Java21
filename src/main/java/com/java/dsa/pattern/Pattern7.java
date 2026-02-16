package com.java.dsa.pattern;

public class Pattern7 {
//    static void main(String[] args) {
//        int n = 4;
//        if(n<=0) {
//            System.out.println("Invalid input");
//            return;
//        }
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <= n*2-1; j++) {
//                if(j==n) {
//                    System.out.print("*");
//                } else if (j<n && i+j>n) {
//                    System.out.print("*");
//                } else if (j>n && j-i<n) {
//                    System.out.print("*");
//                }
//                else if(j<n) {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//        }

    static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++)
        {
            System.out.print(" ".repeat(n-i));
            System.out.println("*".repeat(i*2-1));
        }
    }
}
