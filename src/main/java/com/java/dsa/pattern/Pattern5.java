package com.java.dsa.pattern;

public class Pattern5 {
//    static void main(String[] args) {
//        int n = 5;
//        if(n<=0) {
//            System.out.println("Invalid input");
//            return;
//        }
//        for (int i = n; i >0; i--) {
//            System.out.println(("*").repeat(i));
//        }
//    }

    public static void main(String[] args) {
        int n =5;
        if (n <=0) {
            System.out.println("Invalid input");
            return;
        }

        // StringBuilder is faster for single-threaded use because it avoids the synchronization overhead of StringBuffer, and it avoids creating many intermediate String objects during repeated appends. Use StringBuffer only if multiple threads must mutate the same buffer.
        StringBuilder out = new StringBuilder();
        for (int i = n; i >0; i--) {
            out.append("*".repeat(i)).append('\n');
        }
        System.out.print(out.toString());
    }
}
