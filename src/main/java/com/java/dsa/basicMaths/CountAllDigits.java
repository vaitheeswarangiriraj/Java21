package com.java.dsa.basicMaths;

public class CountAllDigits {
    static void main(String[] args) {
        int n = -5;
//        if(n<=0) {
//            System.out.println("Invalid input");
//            return;
//        }
        int count = 0;
        int temp = Math.abs(n);
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        System.out.println(count);
    }
}
