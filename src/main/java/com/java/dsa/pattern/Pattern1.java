package com.java.dsa.pattern;

public class Pattern1 {
//    static void main(String[] args) {
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

    static void main(String[] args) {
        int n = 5;
        if(n<=0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(("*").repeat(n));
        }
    }
}
