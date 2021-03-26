package com.lokur.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};

        int elem = 2;

        int foundAtIndex = searchElementInArrayIterative(elem, arr);
        System.out.println("Found iteratively at index: " + foundAtIndex);

        foundAtIndex = searchElementInArrayRecursive(elem, 0, arr.length - 1, arr);
        System.out.println("Found recursively at index: " + foundAtIndex);
    }

    // iterative
    private static int searchElementInArrayIterative(int elem, int[] arr) {
        int index = -1;
        int lowerBound = 0;
        int upperBound = arr.length - 1;

        while (lowerBound <= upperBound) {
            int middleIndex = (int) (upperBound + lowerBound) / 2;

            if(elem == arr[middleIndex]) {
                index = middleIndex;
                break;
            } else if(elem < arr[middleIndex]) {
                upperBound = middleIndex - 1;
            } else {
                lowerBound = middleIndex + 1;
            }
            
        }

        return index;
    }


    // Recursive
    private static int searchElementInArrayRecursive(int elem, int lowerBound, int upperBound, int[] arr) {

        int middle = (int) (lowerBound + upperBound) / 2;

        if(lowerBound <= upperBound) {
            if(arr[middle] == elem) {
                return middle;
            } else if (arr[middle] > elem) {
                return searchElementInArrayRecursive(elem, lowerBound, middle - 1, arr);
            } else {
                return searchElementInArrayRecursive(elem, middle + 1, upperBound, arr);
            }
        }

        return -1;
    }
}
