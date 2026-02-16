package com.java.dsa.basicMaths;

public class ReverseNumber {
    static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        int n = 1234;
        System.out.println(reverseNumber.reverseNumber(n));
    }

    public int reverseNumber(int n) {
        int temp = 0;
        while (n > 0) {
            temp = (temp * 10) + n % 10;
            n = n / 10;
        }
        return temp;

    }
}
