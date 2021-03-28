package com.lokur.sort;

import java.util.Arrays;

// O(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {0, 3, 5, 4, 1, 2};

        int frozenIdx = arr.length - 1;

        for(int i=0; i < arr.length - 1; i++) {
            int j = i + 1;

            if(arr[i] > arr[j]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if(j == frozenIdx) {
                frozenIdx--;
                i = -1;
            }
        }

        System.out.println("Sorted array: ");
        Arrays.asList(arr).forEach(n -> System.out.print(" " + n));
        System.out.println();
    }
}
