package com.lokur.fibonacci;

import java.time.Duration;
import java.time.Instant;

public class NthFibonacciNumber {
 
    public static void main(String[] args) {
        // 0 1 1 2 3 5
        int n = 45;
        Instant start = Instant.now();
        int number = fib(n);
        System.out.println(number);
        Instant end = Instant.now();
        System.out.println("Time taken w/o dynamic programming: " + Duration.between(start, end).toSeconds() + " seconds.");


        System.out.println("----------------------------------------");
        start = Instant.now();
        number = fibDP(n);
        System.out.println(number);
        end = Instant.now();
        System.out.println("Time taken with dynamic programming: " + Duration.between(start, end).toNanos() + " nano seconds.");
    }

    // Recursive --- Time complexity: O(2^n)
    private static int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }

    // Efficient appraoch below - using Dynamic programming / memoization - by caching pre-computed values
    // Cyclomatic time complexity = O(n)
    private static int fibDP(int n) {
        return findFib(n, new int[n+1]);
    }

    private static int findFib(int n, int[] memo) {
        if(n==0) return 0;
        if(n==1) return 1;
        
        if(memo[n] == 0) {
            memo[n] = findFib(n-1, memo) + findFib(n-2, memo);
        }
        return memo[n];
    }


}
