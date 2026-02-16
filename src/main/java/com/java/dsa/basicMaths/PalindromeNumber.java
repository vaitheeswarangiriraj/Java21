package com.java.dsa.basicMaths;

public class PalindromeNumber {
    static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int n = 121;
        System.out.println(palindromeNumber.isPalindrome(n));
    }

    public boolean isPalindrome(int n) {
        return reverseNumber(n)==n;
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
