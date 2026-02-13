package com.java.promotions;

public class AddingByte {
    static void main(String[] args) {

        byte a = 10;
        byte b = 20;
        short c = 10;
        short d = 20;
        // byte d = (a + b); // COMPILE ERROR!

        // Reason: In Java, when performing arithmetic operations on byte operands,
        // they are automatically promoted to int (binary numeric promotion).
        // The result of (a + b) is an int, not a byte.
        // Assigning an int value to a byte variable requires explicit casting
        // to acknowledge the potential loss of precision.
        // To fix: byte d = (byte)(a + b);

//        short e = c + d; // Compilation error because the result of (c + d) is promoted to int, but can be assigned to short without explicit casting

        int f = a + b;     // This works because int can hold the int result
    }

}
