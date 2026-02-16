package com.java.dsa.basicMaths;

public class LargestDigit {
    static void main(String[] args) {
        LargestDigit largestDigit = new LargestDigit();
        int n = 25;
        System.out.println(largestDigit.largestDigit(n));
    }

    public int largestDigit (int n) {
        int max = 0;
        while(n>0)
        {
            max = Math.max(max, n % 10);
            n = n/10;
        }
        return  max;
    }

}
