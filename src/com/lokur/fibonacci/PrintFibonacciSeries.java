package com.lokur.fibonacci;

public class PrintFibonacciSeries {

    // 0 1 1 2 3 5 8 13
    static void fib(int p1, int p2, int printFibSeriesTill) {
        if (p2 > printFibSeriesTill) {
            return;
        }

        int p3 = p2 + p1;
        System.out.print(p3 + " ");
        p1 = p2;
        p2 = p3;

        fib(p1, p2, printFibSeriesTill);
    }


    public static void main(String[] args) {
        int printFibSeriesTill = 5;
        System.out.print("0 1 ");

        fib(0, 1, printFibSeriesTill - 2); // -2 because first two are already printed
    }

}
