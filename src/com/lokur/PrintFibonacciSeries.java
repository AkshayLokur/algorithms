package com.lokur;

public class PrintFibonacciSeries {

    // 0 1 1 2 3 5 8 13
    static int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }


    public static void main(String[] args) {
        int printFibSeriesTill = 5;

        for (int i = 0; i < printFibSeriesTill; i++) {
            System.out.print(" " + fib(i));
        }
    }

}
