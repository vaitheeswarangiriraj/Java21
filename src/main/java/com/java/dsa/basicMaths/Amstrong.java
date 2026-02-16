package com.java.dsa.basicMaths;

public class Amstrong {
    static void main(String[] args) {
        Amstrong amstrong = new Amstrong();
        int n = 9474;
        System.out.println(amstrong.isAmstrong(n));
    }

    public boolean isAmstrong(int n) {
        int sumOfPowers = 0;
        int originalValue = n;
        int numberofDigit = numberOfDigits(n);
        while (n > 0) {
            sumOfPowers += (int) Math.pow(n % 10, numberofDigit);
            n = n / 10;
        }
        System.out.println(sumOfPowers);
        return sumOfPowers == originalValue;
    }

    public int numberOfDigits(int n) {
        int digitCount = 0;
        while (n > 0) {
            n = n / 10;
            digitCount++;
        }
        System.out.println(digitCount);
        return digitCount;
    }
}
