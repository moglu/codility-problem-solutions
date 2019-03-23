package com.moglu.codility.lessons.PrefixSums;

public class MinAvgTwoSlice {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 2, 5, 1, 5, 8};
        int[] arr2 = {4, 2};
        int[] arr3 = {1, 1, -1, 1, -1, 1, 1, 1};
        //System.out.println(solution(arr1));
        System.out.println(solution(arr3));

    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        int minSum = Integer.MAX_VALUE;
        int startIndexTwo = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] + A[i + 1] < minSum) {
                minSum = A[i] + A[i + 1];
                startIndexTwo = i;
            }
        }
        double minAvgTwo = minSum / 2.0;
        minSum = Integer.MAX_VALUE;
        int startIndexThree = 0;
        for (int j = 0; j < A.length - 2; j++) {
            if (A[j] + A[j + 1] + A[j + 2] < minSum) {
                minSum = A[j] + A[j + 1] + A[j + 2];
                startIndexThree = j;
            }
        }
        double minAvgThree = minSum / 3.0;

        if (minAvgTwo == minAvgThree) return Math.min(startIndexThree, startIndexTwo);

        if (minAvgTwo < minAvgThree) {
            return startIndexTwo;
        } else {
            return startIndexThree;
        }
    }
}
