package com.java.dsa.basicMaths;

import java.util.stream.LongStream;

public class Factorial {
    static void main(String[] args) {
        Factorial factorial = new Factorial();
        int n = 3;
//        System.out.println(factorial.factorial(n));

        System.out.println(LongStream.rangeClosed(2, n) // Generates numbers 2, 3, ..., n
                .reduce(1, (a, b) -> a * b));
    }

    public int factorial(int n) {
        if (n <= 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
