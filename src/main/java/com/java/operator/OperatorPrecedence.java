package com.java.operator;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int i = 5;
        int x = ++i;
        int y = i++;
        System.out.println(x +" "+ y + " " + i);

        System.out.println(x++ +" "+ ++y);
        // ++, *, - ,==, = (Precedence Order)
    }
}
