package com.java.dsa.basicMaths;

public class CountOddDigits {
    static void main(String[] args) {
        CountOddDigits countOddDigits = new CountOddDigits();
        int n = 125;
        System.out.println(countOddDigits.countOddDigit(n));
    }

    public int countOddDigit(int n) {
        if (n < 0) {
            n = Math.abs(n);
        }
        int count = 0;
        while (n > 0) {
            System.out.println(n % 2);

            if ((n % 2 != 0))
                count++;
            n = n / 10;
        }
        return count;

    }
}
