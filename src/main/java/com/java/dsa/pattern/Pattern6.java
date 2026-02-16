package com.java.dsa.pattern;

public class Pattern6 {
    static void main(String[] args) {
        int n = 5;
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        StringBuilder out = new StringBuilder();
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                out.append(j);
            }
            out.append("\n");
        }
        System.out.println(out);
    }
}
