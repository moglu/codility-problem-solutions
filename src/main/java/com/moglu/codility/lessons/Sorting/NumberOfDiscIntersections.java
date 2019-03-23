package com.moglu.codility.lessons.Sorting;

import java.util.Arrays;

public class NumberOfDiscIntersections {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 2, 1, 4, 0};
        System.out.println(solution(arr1));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int[] startingPoints = new int[A.length];
        int[] endingPoints = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            startingPoints[i] = i + A[i];
            endingPoints[i] = i - A[i];
        }
        Arrays.sort(startingPoints);
        Arrays.sort(endingPoints);

        long count = 0l;
        for (int i = 0; i < A.length; i++) {
            int pos = Arrays.binarySearch(endingPoints, startingPoints[i]);
            if (pos >= 0) {
                while (pos < A.length && endingPoints[pos] == startingPoints[i]) {
                    pos++;
                }
                count += pos;
            } else {
                count += (-pos) - 1;
            }
        }
        return (int) count;
    }
}
